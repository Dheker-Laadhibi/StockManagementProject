package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.ligneCommande;
import com.example.demo.entities.ligneFcommande;
import com.example.demo.service.LigneCClientService;
import com.example.demo.service.LigneCFServices;

@RestController
public class LigneCFController {
	
	 @Autowired
     LigneCFServices  lcs;
   
   
   @CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(value="/ajouterLigneFourni/{idarticle}/{idcommande}")
	public ligneFcommande addlignecommande(@RequestBody ligneFcommande cc , @PathVariable Long idarticle , @PathVariable Long idcommande ) {
		return lcs.addLignecc(cc, idarticle , idcommande);
	}

	
	
	
	
	
	
	
	
	
	
	
	

}
