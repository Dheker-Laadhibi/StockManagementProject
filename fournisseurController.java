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


import com.example.demo.entities.fournisseur;
import com.example.demo.service.fournisseurService;

@CrossOrigin(origins = "*")
@RestController
public class fournisseurController {
	@Autowired
	fournisseurService fouServ;
	

	//add
	 @CrossOrigin(origins ="http://localhost:4200")
	@PostMapping(value="/ajouterFournisseur")
	public fournisseur addArticle(@RequestBody fournisseur fournisseur) {
		return fouServ.addFournisseur(fournisseur);
		
	}
	
	
	
	

	
	// update client  
	 @CrossOrigin(origins ="http://localhost:4200")
		@PostMapping(value="/UpdateFournisseur/{idfournisseur}")
		public fournisseur UpdateUser(@RequestBody fournisseur fournisseur ,@PathVariable Long idfournisseur) {
			return fouServ.updateFournisseur(fournisseur, idfournisseur);
			
		}
	 //delete
		
		
	    @CrossOrigin(origins ="http://localhost:4200")
					@DeleteMapping(value="/deleteFourni/{idfournisseur}")
					public void deleteUser(@PathVariable Long idfournisseur) {
	    	fouServ.deleteFournisseur(idfournisseur);
					return;
					
					}
	    //byid
	    @GetMapping("GetFournisseur/{idfournisseur}")
        public fournisseur getFournisseurById(@PathVariable Long idfournisseur) {
            return fouServ.getFournisseurById(idfournisseur);
        
        

        }
	    
	    
	    
	    @CrossOrigin(origins = "http://localhost:4200")
		@GetMapping(value = "/GetFournisseur")
		public List<fournisseur> Getallfournisseur(){
			return fouServ.GetallFourni();
		}

	
	
	
	
	
	
	
	
	
	
	
	
}
