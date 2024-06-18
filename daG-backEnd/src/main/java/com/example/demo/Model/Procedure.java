package com.example.demo.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "procedures")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Procedure {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String type;

    private String description;

    @Temporal(TemporalType.DATE)
    private Date dateDemande;


    @Temporal(TemporalType.DATE)
    private Date dateAssignation;

    private String status;

    private String code;

    @ManyToOne(fetch = FetchType.EAGER) // Chargement explicite
    @JoinColumn(name = "demandeur_id", nullable = false)
    @JsonBackReference // Gérer les références pour éviter les boucles infinies
    private User demandeur;

    @ManyToOne
    @JoinColumn(name = "agent_id")
    @JsonBackReference // Gérer les références pour éviter les boucles infinies
    private Agent agent;

    @ElementCollection
    private List<String> documentsScannes;

    /*
        La classe Procedure a deux relations Many-to-One,
        une avec User pour le demandeur
        et une avec Agent pour l'agent assigné.
    */

    public Procedure() {
    }

    public Procedure(String type, String description,
                     Date dateDemande,
                     Date dateAssignation, String status,
                     String number, User demandeur,
                     Agent agent,List<String> documentsScannes) {
        this.type = type;
        this.description = description;
        this.dateDemande = dateDemande;
        this.status = status;
        this.code = number;
        this.demandeur = demandeur;
        this.agent = agent;
        this.documentsScannes = documentsScannes;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateDemande() {
        return dateDemande;
    }

    public void setDateDemande(Date dateDemande) {
        this.dateDemande = dateDemande;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getDemandeur() {
        return demandeur;
    }

    public void setDemandeur(User demandeur) {
        this.demandeur = demandeur;
    }

    public List<String> getDocumentsScannes() {
        return documentsScannes;
    }

    public void setDocumentsScannes(List<String> documentsScannes) {
        this.documentsScannes = documentsScannes;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }


    public Date getDateAssignation() {
        return dateAssignation;
    }

    public void setDateAssignation(Date dateAssignation) {
        this.dateAssignation = dateAssignation;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
