package com.example.membre.Services;

import com.example.membre.entity.EnseignantChercheur;
import com.example.membre.entity.Etudiant;
import com.example.membre.entity.Membre;

import java.util.List;

public interface IMembreService {
    public interface IMemberService {
        //Crud sur les membres
        public Membre addMember(Membre m);
        public void deleteMember(Long id) ;
        public Membre updateMember(Membre p) ;
        public Membre findMember(Long id) ;
        public List<Membre> findAll();
        //Filtrage par propriété
        public Membre findByCin(String cin);
        public Membre findByEmail(String email);
        public List<Membre> findByNom(String nom);
        //recherche spécifique des étudiants
        public List<Etudiant> findByDiplome(String diplome);
        //recherche spécifique des enseignants
        public List<EnseignantChercheur> findByGrade(String grade);
        public List<EnseignantChercheur> findByEtablissement(String etablissement);
        public void affecterEtudiantToEnseignant(Long id_etd,Long id_ens);
        public List<Etudiant> findEtudiantsByEncadrant(EnseignantChercheur enseignantChercheur);

    }
}
