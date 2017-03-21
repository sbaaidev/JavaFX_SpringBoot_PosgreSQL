package com.JavaFXSpringboot.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JavaFXSpringboot.dao.EtudiantRepository;
import com.JavaFXSpringboot.entities.Etudiant;

@Service
public class EtudiantMetierImpl implements EtudiantMetier {
	@Autowired
	private  EtudiantRepository etudiantRepository;

	@Override
	public Etudiant saveEtudiant(Etudiant e) {
		// TODO Auto-generated method stub
		return etudiantRepository.save(e);
	}

	@Override
	public List<Etudiant> getAllClient() {
		// TODO Auto-generated method stub
		return etudiantRepository.findAll();
	}
	


}
