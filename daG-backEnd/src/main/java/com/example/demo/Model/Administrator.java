package com.example.demo.Model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name="administrators")
public class Administrator extends UsersModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Date dateCreationCompte;
    private Date dernierLogin;

    public Administrator() {

    }

    public Administrator(String name, String firstName, String email, String phoneNumber, String password, String role, Date dateCreationCompte, Date dernierLogin) {
        super(name, firstName, email, phoneNumber, password, role);
        this.dateCreationCompte = dateCreationCompte;
        this.dernierLogin = dernierLogin;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateCreationCompte() {
        return dateCreationCompte;
    }

    public void setDateCreationCompte(Date dateCreationCompte) {
        this.dateCreationCompte = dateCreationCompte;
    }

    public Date getDernierLogin() {
        return dernierLogin;
    }

    public void setDernierLogin(Date dernierLogin) {
        this.dernierLogin = dernierLogin;
    }


}
