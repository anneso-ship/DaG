package com.example.demo.Service;

import com.example.demo.Model.Administrator;
import com.example.demo.Model.Agent;
import com.example.demo.Model.BirthCertificate;
import com.example.demo.Model.Procedure;
import com.example.demo.Repository.AgentRepository;
import com.example.demo.Repository.ProcedureRepository;
import com.example.demo.exceptions.AgentNotFoundException;
import com.example.demo.exceptions.ProcedureNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import com.example.demo.Service.EmailSender;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AgentService {

    @Autowired
    private EmailSender emailSender;

    @Autowired
    PasswordEncoder encoder;

    @Autowired
    public AgentRepository agentRepository;

    @Autowired
    public ProcedureRepository procedureRepository;

    String Subject = "Inscription en attente";
    String body = "";


    public void createAgent(Agent agent){
        body = Subject +
                "\n" +
                "Cher(e)"+ agent.getName() + agent.getFirstName() + ","+"\n" +
                "\n" +
                "Nous avons bien reçu votre demande d'inscription et nous vous remercions de votre intérêt pour notre service. Nous sommes en train de traiter votre demande et vous recevrez un numéro d'identification unique dans les plus brefs délais.\n" +
                "\n" +
                "Une fois que vous aurez reçu votre numéro d'identification unique, vous pourrez vous connecter à notre service en utilisant votre adresse e-mail et votre numéro d'identification unique.\n" +
                "\n" +
                "Nous travaillons dur pour traiter votre demande dans les plus brefs délais. Si vous avez des questions ou des préoccupations, n'hésitez pas à nous contacter à l'adresse e-mail suivante : [votre adresse e-mail de contact].\n" +
                "\n" +
                "Merci de votre patience et de votre compréhension.\n" +
                "\n" +
                "Cordialement,";
        agent.setPassword(encoder.encode(agent.getPassword()));
        this.agentRepository.save(agent);
        emailSender.sendEmail(agent.getEmail(),Subject,body);

    }

    public void AssignProceduretoAnAgent(Long agentId, Long procedureId) {
        // Récupérer l'agent depuis la base de données
        Optional<Agent> agentOptional = agentRepository.findById(agentId);
        if (agentOptional.isPresent()) {
            Agent agent = agentOptional.get();

            // Récupérer la procédure depuis la base de données
            Optional<Procedure> procedureOptional = procedureRepository.findById(procedureId);
            if (procedureOptional.isPresent()) {
                Procedure procedure = procedureOptional.get();

                // Assigner la procédure à l'agent
                procedure.setAgent(agent);
                procedureRepository.save(procedure);
            } else {
                throw new ProcedureNotFoundException("Procédure non trouvée avec l'ID : " + procedureId);
            }
        } else {
            throw new AgentNotFoundException("Agent non trouvé avec l'ID : " + agentId);
        }
    }

    public List<Procedure> getProceduresAssigned(Long id) {
        // Récupérer l'agent depuis la base de données
        Optional<Agent> agentOptional = agentRepository.findById(id);
        if (agentOptional.isPresent()) {
            Agent agent = agentOptional.get();
            return agent.getProceduresAssignees();
        } else {
            throw new AgentNotFoundException("Agent non trouvé avec l'ID : " + id);
        }
    }

    public Optional<Agent> getAgentById(Long id){
        return this.agentRepository.findById(id);
    }

    public Agent loginAgent(Agent agent){
        Optional<Agent> agentDb = agentRepository.findByEmail(agent.getEmail());
        if (agentDb.isEmpty()) {
            throw new HttpClientErrorException(HttpStatus.UNAUTHORIZED);
        } else {
            if ( encoder.matches(agent.getPassword(),agentDb.get().getPassword())
                    && agent.getEmail().equals(agentDb.get().getEmail()) ) {
                return agentDb.get();
            } else {
                throw new HttpClientErrorException(HttpStatus.UNAUTHORIZED);
            }
        }
    }



    public List<Agent> getAllAgent() {
        return this.agentRepository.findAll();
    }


    public List<Agent> getRequest() {
        // récupérer tous les agents depuis le repository
        List<Agent> allAgents = agentRepository.findAll();

        // filtrer les agents dont le numéro identifier est null
        List<Agent> filteredAgents = allAgents.stream()
                .filter(agent -> agent.getEmail() == null)
                .collect(Collectors.toList());

        return filteredAgents;
    }
}
