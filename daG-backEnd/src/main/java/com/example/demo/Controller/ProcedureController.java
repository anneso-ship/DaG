package com.example.demo.Controller;

import com.example.demo.Model.Procedure;
import com.example.demo.Service.ProcedureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("procedures")
public class ProcedureController {

    @Autowired
    private ProcedureService procedureService;

    @PostMapping(value = "new_procedure")
    public Procedure createProcedure(@RequestBody Procedure procedure) {
        return procedureService.createProcedure(procedure);
    }

    @GetMapping("/count")
    public long getTotalProcess() {
        return procedureService.getTotalProcedure();
    }

    @GetMapping("/count/en_attente")
    public Long getCountOfEnAttenteProcedures() {
        return procedureService.getCountOfEnAttenteProcedures();
    }

    @GetMapping("/count/en_cours")
    public Long getCountOfEnCoursProcedures() {
        return procedureService.getCountOfEnCoursProcedures();
    }

    @GetMapping("/count/terminee")
    public Long getCountOfTerminatedProcedures() {
        return procedureService.getCountOfTerminatedProcedures();
    }

    @GetMapping("/count/rejetee")
    public Long getCountOfRejeteeProcedures() {
        return procedureService.getCountOfRejeteeProcedures();
    }

    @GetMapping("/count/assigned")
    public Long getCountOfAssignedProcedures() {
        return procedureService.getCountOfAssignedProcedures();
    }

    @GetMapping("/count/unassigned")
    public Long getCountOfUnassignedProcedures() {
        return procedureService.getCountOfUnassignedProcedures();
    }


    @GetMapping(value = "get_all_process_details")
    public List<Procedure> getAllProcedures() {
        return procedureService.getAllProcedures();
    }

    @GetMapping(value="procedure-details/{id}")
    public Optional<Procedure> getProcedureById(@PathVariable Long id) {
        return procedureService.getProcedureById(id);
    }

    @PutMapping("/{id}")
    public Procedure updateProcedure(@PathVariable Long id,
                                     @RequestParam Date dateDemande,
                                     @RequestParam String status,
                                     @RequestParam List<String> documentsScannes) {
        return procedureService.updateProcedure(id, dateDemande, status, documentsScannes);
    }

    @DeleteMapping("/{id}")
    public void deleteProcedure(@PathVariable Long id) {
        procedureService.deleteProcedure(id);
    }


}
