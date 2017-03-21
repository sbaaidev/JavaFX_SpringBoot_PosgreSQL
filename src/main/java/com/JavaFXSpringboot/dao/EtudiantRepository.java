package com.JavaFXSpringboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JavaFXSpringboot.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {

}
