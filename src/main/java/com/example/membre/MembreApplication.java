package com.example.membre;

import com.example.membre.Dao.EtudiantRepository;
import com.example.membre.Dao.MembreRepository;
import com.example.membre.Services.MembreService;
import com.example.membre.entity.EnseignantChercheur;
import com.example.membre.entity.Etudiant;
import com.example.membre.entity.Membre;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.Optional;

@SpringBootApplication
@AllArgsConstructor
public abstract class MembreApplication implements CommandLineRunner {
    MembreRepository membreRepository;
    MembreService membreService;

    public static void main(String[] args) {
        SpringApplication.run(MembreApplication.class, args);}
    public void run(String... args) throws Exception{
        Etudiant etd1 = Etudiant.builder()
                .cin("12345678")
                .dateInscription(new Date())
                .dateNaissance(new Date())
                .diplome("mastère")
                .email("etd1@gmail.com")
                .password("pass1")
                .cv("cv1")
                .nom("abid")
                .prenom("youssef)")
                .sujet("dev")
                .build();
        /*
        Etudiant etd2 = Etudiant.builder()
                .cin("11141418")
                .dateInscription(new Date())
                .dateNaissance(new Date())
                .diplome("mastère")
                .email("etd2@gmail.com")
                .password("pass2")
                .cv("cv2")
                .nom("boujelben")
                .prenom("marwen)")
                .sujet("blockhain")
                .build();
        EnseignantChercheur ens1 = EnseignantChercheur.builder()
                .cin("22222222")
                .dateNaissance(new Date())
                .email("etd2@gmail.com")
                .password("pass2")
                .cv("cv2")
                .nom("enseignant1")
                .prenom("ens)")
                .grade("enseignant")
                .build();
        EnseignantChercheur ens3 = EnseignantChercheur.builder()
                .cin("33333333")
                .dateNaissance(new Date())
                .email("ens3@gmail.com")
                .password("pass3")
                .cv("cv3")
                .nom("enseignant3")
                .prenom("ens)")
                .grade("enseignant")
                .build();*/


    }
}
