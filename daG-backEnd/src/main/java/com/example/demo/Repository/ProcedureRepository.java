package com.example.demo.Repository;

import com.example.demo.Model.Procedure;
import com.example.demo.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProcedureRepository extends JpaRepository<Procedure, Long> {
    Optional<Procedure> findById(java.lang.Long id);

    @Query("SELECT COUNT(p) FROM Procedure p WHERE p.status = 'EN_ATTENTE'")
    Long countByStatusEnAttente();

    @Query("SELECT COUNT(p) FROM Procedure p WHERE p.status = 'EN_COURS'")
    Long countByStatusEnCours();

    @Query("SELECT COUNT(p) FROM Procedure p WHERE p.status = 'TERMINEE'")
    Long countByStatusTerminee();

    @Query("SELECT COUNT(p) FROM Procedure p WHERE p.status = 'REJETEE'")
    Long countByStatusRejetee();

    @Query("SELECT COUNT(p) FROM Procedure p WHERE p.agent IS NOT NULL")
    Long countByAssignedProcedures();

    @Query("SELECT COUNT(p) FROM Procedure p WHERE p.agent IS NULL")
    Long countByUnassignedProcedures();


}
