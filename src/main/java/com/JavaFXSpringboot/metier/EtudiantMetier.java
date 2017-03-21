package com.JavaFXSpringboot.metier;

import java.util.List;

import com.JavaFXSpringboot.entities.Etudiant;


public interface EtudiantMetier {
	
	public Etudiant saveEtudiant(Etudiant e);
	public List<Etudiant> getAllClient();

}
