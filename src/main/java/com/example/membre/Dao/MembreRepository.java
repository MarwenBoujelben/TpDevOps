package com.example.membre.Dao;

import com.example.membre.entity.Membre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MembreRepository extends JpaRepository<Membre,Long>
{

    Membre findByCin(String cin);
    List<Membre> findByNomStartingWith(String caractere);
    Membre findByEmail(String email);
    List<Membre> findByNom(String nom);
}
