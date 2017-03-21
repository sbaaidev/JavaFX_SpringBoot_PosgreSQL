package com.JavaFXSpringboot.controller;



import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;


import com.JavaFXSpringboot.entities.Etudiant;
import com.JavaFXSpringboot.metier.EtudiantMetier;

import de.felixroske.jfxsupport.FXMLController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;


@FXMLController
public class EtudiantController{
	@FXML
	private TextField txtNomEtudiant;
	@FXML
	private TableView<Etudiant> tableEtudiant;
	@FXML
	private TableColumn<Etudiant, Long> colid;
	@FXML
	private TableColumn<Etudiant, String> colnom;
	
	private ObservableList<Etudiant> listE=FXCollections.observableArrayList();
	
	@Autowired
	private EtudiantMetier etudiantMetier;

	
	@FXML
	public void saveEtudiant() {
		Etudiant e=new Etudiant(txtNomEtudiant.getText());
		etudiantMetier.saveEtudiant(e);
		setData();
	}


	public void initialize() {
		colid.setCellValueFactory(new PropertyValueFactory<Etudiant,Long>("idEtudiant"));
		colnom.setCellValueFactory(new PropertyValueFactory<Etudiant,String>("nom"));
		setData();
		
		
	}
	
	public void setData(){
		listE.clear();
		for (Etudiant etudiant : etudiantMetier.getAllClient()) {
			listE.add(etudiant);
			
		}
		tableEtudiant.setItems(listE);
		
	}
	

}
