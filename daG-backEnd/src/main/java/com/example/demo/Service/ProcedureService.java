package com.example.demo.Service;

import com.example.demo.Model.Procedure;
import com.example.demo.Model.User;
import com.example.demo.Repository.ProcedureRepository;
import com.example.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ProcedureService {

    @Autowired
    private ProcedureRepository procedureRepository;

    @Autowired
    private UserRepository userRepository;

    public Procedure createProcedure(Procedure procedure) {
        Long demandeurId = procedure.getDemandeur().getId();
        Optional<User> demandeurOpt = userRepository.findById(demandeurId);

        if (demandeurOpt.isPresent()) {
            User demandeur = demandeurOpt.get();
            procedure.setDemandeur(demandeur);
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
