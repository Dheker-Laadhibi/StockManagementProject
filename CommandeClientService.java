package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.client;
import com.example.demo.entities.commandeClient;
import com.example.demo.entities.ligneCommande;
import com.example.demo.repository.ClientRepository;
import com.example.demo.repository.CommandeClientRepository;

@Service
public class CommandeClientService {

	
	@Autowired
	ClientRepository clRep;
	@Autowired
	CommandeClientRepository ccRep;
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	 public void getTotalCommandeByCommandeId(Long commandeId) {
	        commandeClient commande = ccRep.findById(commandeId).orElse(null);
	      
	        ccRep.calculateTotalForCommande(commandeId);
	        
	  
	    }
	 
	  
 

	 
	public commandeClient addCommandeClient(commandeClient cl ,Long idclient) {
		 
		client client = clRep.findById(idclient).get();
		cl.setClient(client);
		
		
		return ccRep.save(cl);
			
		
	}

	
	


	
	public List<commandeClient> GetAllCommandes() {

		return ccRep.findAll();
	}
	
	
	
	
	
	
	 public Double getTotalForCommande(Long commandeId) {
	        return ccRep.calculateTotalForCommande(commandeId);
	    }
	
	

		public void deleteCommande(Long idcommande) {
			  Optional<commandeClient> CommandeOptional = ccRep.findById(idcommande);
			    
			    if (CommandeOptional.isPresent()) {
			    	clRep.deleteById(idcommande);
			        
			    } 
			
		}
	
	
	
	
	
}
