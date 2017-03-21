package com.JavaFXSpringboot.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.JavaFXSpringboot.Starter;
import com.JavaFXSpringboot.entities.Etudiant;
import com.JavaFXSpringboot.metier.EtudiantMetier;

import de.felixroske.jfxsupport.FXMLController;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

@FXMLController
public class EtudiantController {
	@FXML
	private TextField txtNomEtudiant;
	
	@Autowired
	private EtudiantMetier etudiantMetier;
	
	private Starter main;
	private Stage stage;
	public void setMain(Starter main,Stage stage){
		this.main=main;
		this.stage=stage;
	}
	@FXML
	public void saveEtudiant() {
		Etudiant e=new Etudiant(txtNomEtudiant.getText());
		etudiantMetier.saveEtudiant(e);
	}
	

}
