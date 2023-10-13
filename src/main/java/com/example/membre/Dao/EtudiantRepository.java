package com.example.membre.Dao;

import com.example.membre.entity.EnseignantChercheur;
import com.example.membre.entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
    List<Etudiant> findByDiplome(String diplome);
    List<Etudiant> findByEncadrant(EnseignantChercheur enseignantChercheur);
    List<Etudiant>findByDiplomeOrderByDateInscriptionDesc(String diplome);
}
