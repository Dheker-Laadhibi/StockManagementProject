package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.commandeClient;
import com.example.demo.entities.ligneCommande;
import com.example.demo.service.CommandeClientService;
import com.example.demo.service.LigneCClientService;

@RestController
public class ligneCController {
	
	
	
	  @Autowired
     LigneCClientService lcs;
   
   
   @CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(value="/ajouterLigneCClient/{idarticle}/{idcommande}")
	public ligneCommande addlignecommande(@RequestBody ligneCommande cc , @PathVariable Long idarticle , @PathVariable Long idcommande ) {
		return lcs.addLignecc(cc, idarticle , idcommande);
	}


	
			

}
