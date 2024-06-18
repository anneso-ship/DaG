package com.example.demo.Model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="agents")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Agent extends UsersModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    String departement;

    @Temporal(TemporalType.DATE)
    Date dateEmbauche;

    @OneToMany(mappedBy = "agent", cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Procedure> proceduresAssignees;

    /*
         relation One-to-Many avec Procedure pour représenter les procédures assignées à l'agent
    */

    public Agent(){}

    public Agent(String name, String firstName, String email,
                 String phoneNumber, String password, String role,
                 String departement, Date dateEmbauche,
                 List<Procedure> proceduresAssignees) {
        super(name, firstName, email, phoneNumber, password, role);
        this.departement = departement;
        this.dateEmbauche = dateEmbauche;
        this.proceduresAssignees = proceduresAssignees;
    }

    public List<Procedure> getProceduresAssignees() {
        return proceduresAssignees;
    }

    public void setProceduresAssignees(List<Procedure> proceduresAssignees) {
        this.proceduresAssignees = proceduresAssignees;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public Date getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(Date dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }
}
