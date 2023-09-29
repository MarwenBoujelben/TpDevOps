package com.example.membre.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.util.Date;

@Entity @DiscriminatorValue("etd")
@Getter
@Setter
@NoArgsConstructor
public class Etudiant extends Membre{
    @ManyToOne
    EnseignantChercheur encadrant;
    @NonNull
    private String sujet;
    @NonNull
    private String diplome;
    @NonNull
    private Date dateInscription;

    @Builder
    public Etudiant( String cin,  String nom,  String prenom, Date dateNaissance, String cv, String email, String password, String sujet, String diplome, Date dateInscription) {
        super(cin, nom, prenom, dateNaissance, cv, email, password);
        this.sujet = sujet;
        this.diplome = diplome;
        this.dateInscription = dateInscription;
    }
}
