package com.example.demo.service;

import java.util.List;


import com.example.demo.entities.fournisseur;

public interface InterFournisseurService {

	
	
	public  fournisseur  addFournisseur(fournisseur fournisseur  );


	public fournisseur updateFournisseur(fournisseur fournisseur, Long idfournisseur );


public void deleteFournisseur(Long idclient);


public List<fournisseur>GetallFourni();
	
}
