package com.JavaFXSpringboot.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Etudiant implements Serializable {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idEtudiant;
	private String nom;
	public Long getIdEtudiant() {
		return idEtudiant;
	}
	public void setIdEtudiant(Long idEtudiant) {
		this.idEtudiant = idEtudiant;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Etudiant(String nom) {
		super();
		this.nom = nom;
	}
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
