package com.example.demo.Model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="users")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class User extends UsersModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private char gender;

    @Temporal(TemporalType.DATE)
    Date birthDate;

    @OneToMany(mappedBy = "demandeur", cascade = CascadeType.ALL, fetch = FetchType.LAZY) // Chargement paresseux
    @JsonManagedReference
    private List<Procedure> procedures;

    /*

    * La classe User a une relation One-to-Many avec Procedure pour représenter
    * les procédures demandées par l'utilisateur.

    * */

    public User(){}

    public User(String name, String firstName,
                String email, String phoneNumber,
                String password, String role, char gender,
                Date birthDate, List<Procedure> procedures) {
        super(name, firstName, email, phoneNumber, password, role);
        this.gender = gender;
        this.birthDate = birthDate;
        this.procedures = procedures;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public List<Procedure> getProcedures() {
        return procedures;
    }

    public void setProcedures(List<Procedure> procedures) {
        this.procedures = procedures;
    }



}
