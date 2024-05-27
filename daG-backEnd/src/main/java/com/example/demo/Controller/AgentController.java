package com.example.demo.Controller;

import com.example.demo.Model.Administrator;
import com.example.demo.Model.Agent;
import com.example.demo.Model.BirthCertificate;
import com.example.demo.Service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("agent")
public class AgentController {


    @Autowired
    private AgentService agentService;



    //requete création user
    @PostMapping(value = "agentRegistration")
    public void addUser(@RequestBody Agent agent){
        System.out.println(agent);
        agentService.createAgent(agent);
    }

    @PostMapping(value="assignation_agent_to_process/{agentId}/{procedureId}")
    public ResponseEntity<String> assignAgentToProcess(@PathVariable("agentId") Long agentId, @PathVariable("procedureId") Long procedureId){
        agentService.AssignProceduretoAnAgent(agentId, procedureId);
        return ResponseEntity.ok("Procédure assignée avec succès à l'agent avec l'ID : " + agentId);
    }

    @GetMapping(value="recover_process_assigned/{agentId}")
    public void recoverProcessAssigned(@PathVariable("agentId") Long agentId){
        agentService.getProceduresAssigned(agentId);
    }

    /*
    @PostMapping("/{agentId}/assigner-procedure/{procedureId}")
    public ResponseEntity<String> assignerProcedureAUnAgent(@PathVariable Long agentId, @PathVariable Long procedureId) {
        agentService.assignerProcedureAUnAgent(agentId, procedureId);
        return ResponseEntity.ok("Procédure assignée avec succès à l'agent avec l'ID : " + agentId);
    }*/

    @GetMapping(value= "getAgentById/{id}")
    public Agent getAgentById(@PathVariable("id") Long id){
        return this.agentService.getAgentById(id).get();
    }

    @GetMapping(value="getRequest")
    public List<Agent> getRequestRegistration(){return agentService.getRequest();}

    //requete connexion d'un agent
    @PostMapping(value = "authenticate")
    public Agent authenticate(@RequestBody Agent agent) {
        return agentService.loginAgent(agent);
    }

    //Afficher les agents
    @GetMapping(value= "get_agents_details")
    public List<Agent> getAllAgent(){
        return agentService.getAllAgent();
    }



}
