package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.StockMovement;
import com.example.demo.service.StockMovementService;

@RestController
@CrossOrigin(origins = "http://localhost:4200") 
public class mvstckController {
	
	
	
	@Autowired
	StockMovementService  stckmv;
	
	//add method 
	
	 @CrossOrigin(origins ="http://localhost:4200")
	  @PostMapping("/createForClient/{idCommandeClient}")
	    public StockMovement createStockMovementForCommandeClient(@RequestBody StockMovement stockMovement, @PathVariable Long idCommandeClient) {
	        return stckmv.creerMouvementDeStockPourCommandeClient(stockMovement, idCommandeClient);
	    }
	  
	 
	 @PostMapping("/createForSupplier/{idCommandeFournisseur}")
	    public StockMovement createStockMovementForCommandeFournisseur(@RequestBody StockMovement stockMovement, @PathVariable Long idCommandeFournisseur) {
	        return stckmv.creerMouvementDeStockPourCommandeFournisseur(stockMovement, idCommandeFournisseur);
	    }
	  
	 @CrossOrigin(origins ="http://localhost:4200")
	  @GetMapping(value ="/Lister" )
		 public List<StockMovement> getAllStockMovements() {
		        return stckmv.getAllStockMovements();
		    
		 }
		 
		 
         //delete 
	
		  
		  //update 
	 @CrossOrigin(origins ="http://localhost:4200")
		  @PostMapping(value="/UpdateMvt/{id}")
		  public StockMovement updateStockMovement(Long id, StockMovement updatedStockMovement) {
		  stckmv.updateStockMovement(id, updatedStockMovement);
		        return null;
		    }
		  
		  
	  
	  
	  

}
