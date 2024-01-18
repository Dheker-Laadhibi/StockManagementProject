package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entities.commandeFournisseur;

import com.example.demo.service.CommandeFournisseurService;

@RestController
public class commandeFournisseurController {
	
	
	
	 @Autowired
     CommandeFournisseurService cfs;
  
  
  @CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(value="/ajoutercommandeFournisseur/{idfournisseur}")
	public commandeFournisseur addArticle(@RequestBody commandeFournisseur cc , @PathVariable Long idfournisseur) {
		return cfs.addCommandeFourni(cc,idfournisseur);
		
	}
  /*
  @CrossOrigin(origins = "http://localhost:4200")
  @GetMapping("/commandes/{commandeId}")
   public void getTotalCommande(@PathVariable Long commandeId) {
       return cls.getTotalCommandeByCommandeId(commandeId);
   }
*/
  @CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(value = "/GetAllCommandesFourni")
	public List<commandeFournisseur> GetAllCommandes(){
		return cfs.GetAllCommandesF();
	}
	@CrossOrigin(origins = "http://localhost:4200")
	   @GetMapping("prixtot2/{commandeId}")
	   public Double calculateTotalForCommande(@PathVariable Long commandeId) {
	       return cfs.getTotalForCommande(commandeId);
	   }

}
