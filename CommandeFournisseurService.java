package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.client;
import com.example.demo.entities.commandeClient;
import com.example.demo.entities.commandeFournisseur;
import com.example.demo.entities.fournisseur;
import com.example.demo.repository.ClientRepository;
import com.example.demo.repository.CommandeClientRepository;
import com.example.demo.repository.CommandeFournisseurRepository;
import com.example.demo.repository.fournisseurRepository;

@Service
public class CommandeFournisseurService {
	
	
	@Autowired
	fournisseurRepository FRep;
	@Autowired
	CommandeFournisseurRepository cFRep;
	
	
	
	
	
	 
	public commandeFournisseur addCommandeFourni(commandeFournisseur cf ,Long idfourni) {
		 
		fournisseur fr = FRep.findById(idfourni).get();
		cf.setFournisseur(fr);
		
		
		return cFRep.save(cf);
			
		
	}
	
	

	
	public List<commandeFournisseur> GetAllCommandesF() {

		return cFRep.findAll();
	}
	
	
	
	
	
	
	
	 public Double getTotalForCommande(Long commandeId) {
	        return cFRep.calculateTotalForCommande(commandeId);
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
