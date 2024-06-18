package com.example.demo.Service;

import com.example.demo.Model.Procedure;
import com.example.demo.Model.User;
import com.example.demo.Repository.ProcedureRepository;
import com.example.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ProcedureService {

    @Autowired
    private ProcedureRepository procedureRepository;

    @Autowired
    private UserRepository userRepository;


    public long getTotalProcedure() {
        return procedureRepository.count();
    }

    //Nombre de procédure en attente
    public Long getCountOfEnAttenteProcedures() {
        return procedureRepository.countByStatusEnAttente();
    }

    //Nombre de procédure en cours
    public Long getCountOfEnCoursProcedures() {
        return procedureRepository.countByStatusEnCours();
    }

    //Nombre de procédure cloturer

    public Long getCountOfTerminatedProcedures() {
        return procedureRepository.countByStatusTerminee();
    }

    //Nombre de procédure rejetée
    public Long getCountOfRejeteeProcedures() {
        return procedureRepository.countByStatusRejetee();
    }

    //Nombre de procédure assignée
    public Long getCountOfAssignedProcedures() {
        return procedureRepository.countByAssignedProcedures();
    }

    //Nombre de procédure non assignée
    public Long getCountOfUnassignedProcedures() {
        return procedureRepository.countByUnassignedProcedures();
    }

    public String RandomGeneratorNumber(){
        String LOWERCASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
        String UPPERCASE_LETTERS = LOWERCASE_LETTERS.toUpperCase();
        String NUMBERS = "0123456789";
        String SPECIAL_CHARACTERS = "!@#$%^&*_=+-/";
        String ALL_CHARACTERS = LOWERCASE_LETTERS + UPPERCASE_LETTERS + NUMBERS + SPECIAL_CHARACTERS;
        SecureRandom RANDOM = new SecureRandom();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            int randomIndex = RANDOM.nextInt(ALL_CHARACTERS.length());
            char randomChar = ALL_CHARACTERS.charAt(randomIndex);
            sb.append(randomChar);
        }

        return sb.toString();

    }

    public Procedure createProcedure(Procedure procedure) {
        Long demandeurId = procedure.getDemandeur().getId();
        Optional<User> demandeurOpt = userRepository.findById(demandeurId);

        if (demandeurOpt.isPresent()) {
            User demandeur = demandeurOpt.get();
            procedure.setDemandeur(demandeur);
            procedure.setCode(RandomGeneratorNumber());
            return procedureRepository.save(procedure);
        } else {
            throw new RuntimeException("Demandeur non trouvé");
        }
    }

    public List<Procedure> getAllProcedures() {
        return procedureRepository.findAll();
    }

    public Optional<Procedure> getProcedureById(Long id) {
        return procedureRepository.findById(id);
    }



    public Procedure updateProcedure(Long id, Date dateDemande, String status, List<String> documentsScannes) {
        Optional<Procedure> procedureOpt = procedureRepository.findById(id);

        if (procedureOpt.isPresent()) {
            Procedure procedure = procedureOpt.get();
            procedure.setDateDemande(dateDemande);
            procedure.setStatus(status);
            procedure.setDocumentsScannes(documentsScannes);
            return procedureRepository.save(procedure);
        } else {
            throw new RuntimeException("Procédure non trouvée");
        }
    }

    public void deleteProcedure(Long id) {
        procedureRepository.deleteById(id);
    }


}
