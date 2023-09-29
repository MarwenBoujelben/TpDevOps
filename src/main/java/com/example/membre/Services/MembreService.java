package com.example.membre.Services;

import com.example.membre.Dao.EnseignantChercheurRepository;
import com.example.membre.Dao.EtudiantRepository;
import com.example.membre.Dao.MembreRepository;
import com.example.membre.entity.Membre;
import com.example.membre.entity.Etudiant;
import com.example.membre.entity.EnseignantChercheur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembreService implements IMembreService.IMemberService {
    @Autowired
    MembreRepository membreRepository;
    EtudiantRepository etudiantRepository;
    EnseignantChercheurRepository enseignantChercheurRepository;
    public Membre addMember(Membre m) {
        membreRepository.save(m);
        return m;
    }
    public void deleteMember(Long id) {
        membreRepository.deleteById(id);
    }
    public Membre updateMember(Membre m) {
        return membreRepository.saveAndFlush(m);
    }
    public Membre findMember(Long id) {
        Membre m= (Membre)membreRepository.findById(id).get();
        return m;
    }
    public List<Membre> findAll() {
        return membreRepository.findAll();}
    public Membre findByCin(String cin) {
        return membreRepository.findByCin(cin);}
    public Membre findByEmail(String email) {
        return membreRepository.findByEmail(email);}
    public List<Membre> findByNom(String nom) {
        return membreRepository.findByNom(nom);}
    public List<Etudiant> findByDiplome(String diplome) {
        return etudiantRepository.findByDiplome(diplome);
    }
    public List<EnseignantChercheur> findByGrade(String grade) {
        return enseignantChercheurRepository.findByGrade(grade);
    }
    public List<EnseignantChercheur> findByEtablissement(String etablissement) {
        return enseignantChercheurRepository.findByEtablissement(etablissement);
    }}
