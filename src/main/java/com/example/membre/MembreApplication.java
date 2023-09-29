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
        


    }
}
