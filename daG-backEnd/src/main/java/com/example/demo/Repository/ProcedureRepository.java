package com.example.demo.Repository;

import com.example.demo.Model.Procedure;
import com.example.demo.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProcedureRepository extends JpaRepository<Procedure, Long> {
    Optional<Procedure> findById(java.lang.Long id);

}
