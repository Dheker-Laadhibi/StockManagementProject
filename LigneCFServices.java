package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.article;
import com.example.demo.entities.commandeClient;
import com.example.demo.entities.commandeFournisseur;
import com.example.demo.entities.ligneCommande;
import com.example.demo.entities.ligneFcommande;
import com.example.demo.repository.CommandeClientRepository;
import com.example.demo.repository.CommandeFournisseurRepository;
import com.example.demo.repository.LigneCFRepository;
import com.example.demo.repository.articleRepository;

@Service
public class LigneCFServices {

	@Autowired
	LigneCFRepository lcf;
	
	@Autowired
	articleRepository articleRep;
	
	@Autowired
	CommandeFournisseurRepository  cfR;
	
	 
	public ligneFcommande addLignecc(ligneFcommande lc ,Long idarticle , Long idcommande) {
		 
		article article = articleRep.findById(idarticle).get();
		lc.setArticle(article);
		commandeFournisseur cc = cfR.findById(idcommande).get();
		lc.setCommandeFournisseur(cc);
		
		return lcf.save(lc);
			
		
	}

	
}
