package com.example.demo.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="agents")
public class Agent extends UsersModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    String departement;
    Date dateEmbauche;

    public Agent(){}

    public Agent(String name, String firstName,
                 String email, String phoneNumber,
                 String password, String role,
                 String departement, Date dateEmbauche) {
        super(name, firstName, email, phoneNumber, password, role);
        this.departement = departement;
        this.dateEmbauche = dateEmbauche;
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
