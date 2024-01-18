package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.entities.fournisseur;
@Repository
public interface fournisseurRepository  extends JpaRepository<fournisseur, Long>{
	
	fournisseur findByIdfournisseur(Long id);
}
