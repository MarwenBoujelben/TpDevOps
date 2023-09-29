package com.example.membre.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.Collection;
import java.util.Date;

@Entity @DiscriminatorValue("ens")
@Getter
@Setter
@NoArgsConstructor

public class EnseignantChercheur extends Membre{
    @OneToMany(mappedBy="encadrant")
    Collection<Etudiant> listEtudiants;
    @NonNull
    private String grade;
    @NonNull
    private String etablissement;
    @Builder
    public EnseignantChercheur( String cin,  String nom,  String prenom,  Date dateNaissance,  String cv,  String email,  String password,  String grade,  String etablissement) {
        super(cin, nom, prenom, dateNaissance, cv, email, password);
        this.grade = grade;
        this.etablissement = etablissement;
    }
}
