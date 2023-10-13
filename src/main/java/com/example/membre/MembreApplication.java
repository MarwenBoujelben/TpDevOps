package com.example.membre;

import com.example.membre.Dao.EnseignantChercheurRepository;
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
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
@AllArgsConstructor
@EnableDiscoveryClient
public abstract class MembreApplication implements CommandLineRunner {
    MembreService membreService;
    EnseignantChercheurRepository enseignantChercheurRepository;
    public static void main(String[] args) {
        SpringApplication.run(MembreApplication.class, args);}
    public void run(String... args) throws Exception{
        Membre membre= membreService.findMember(4L);
        membre.setCv("cv22.pdf");
        membreService.updateMember(membre);
        membreService.deleteMember(7L);
        //////////////////////////
        Membre m=membreService.findByCin("11141418");
        System.out.println(("Membre: "+m.getNom()));
        List<Etudiant> etds=membreService.findByDiplome("mastère");
        for (Etudiant etd : etds) {
            System.out.println("Name of Student: "+etd.getNom());

        }
        //membreService.affecterEtudiantToEnseignant(4L,6L);
        EnseignantChercheur ens=enseignantChercheurRepository.findById(6L).get();
        List<Etudiant> etudiants=membreService.findEtudiantsByEncadrant(ens);
        for (Etudiant etd : etudiants) {
            System.out.println("Name of Student: "+etd.getNom());
        }
    }
}
