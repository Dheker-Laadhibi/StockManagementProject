package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.StockMovement;
import com.example.demo.entities.categorie;
import com.example.demo.entities.commandeClient;
import com.example.demo.entities.commandeFournisseur;
import com.example.demo.repository.CommandeClientRepository;
import com.example.demo.repository.CommandeFournisseurRepository;
import com.example.demo.repository.StockMovementRepository;

@Service
public class StockMovementService {
	
	@Autowired
	StockMovementRepository stR;
	
	@Autowired
	CommandeClientRepository ccr;
	@Autowired
	CommandeFournisseurRepository cfr;
	
	
	//lister 
	 public List<StockMovement> getAllStockMovements() {
	        return stR.findAll();
	    }
	//add mvt  for client 
	
	  public StockMovement creerMouvementDeStockPourCommandeClient(StockMovement stockMovement, Long idcommande ) {
		  commandeClient cat = ccr.findById(idcommande).get();
	        stockMovement.setCommandeClient(cat);
	        return stR.save(stockMovement);
	    }
	  
	  //add mvt for supplier 
	    public StockMovement creerMouvementDeStockPourCommandeFournisseur(StockMovement stockMovement,Long idcommande) {
	    	commandeFournisseur cat2 = cfr.findById(idcommande).get();

	    	
	    	
	        stockMovement.setCommandeFournisseur(cat2);
	        return stR.save(stockMovement);
	    }
	  
	  
	  
	  
	  
	  
	  
	  
	  //update 
	  public StockMovement updateStockMovement(Long id, StockMovement updatedStockMovement) {
	        StockMovement existingMovement = stR.findById(id).orElse(null);
	        if (existingMovement != null) {
	            existingMovement.setDate(updatedStockMovement.getDate());
	            existingMovement.setQuantity(updatedStockMovement.getQuantity());
	            existingMovement.setMovementType(updatedStockMovement.getMovementType());
	            return stR.save(existingMovement);
	        }
	        return null;
	    }
	  
	  
	  
	  
	  //delete 
	  public boolean deleteStockMovement(Long id) {
	        stR.deleteById(id);
	        return true;
	    }
	  
	  
	  
	  
	  
	  
	  
	  

}
