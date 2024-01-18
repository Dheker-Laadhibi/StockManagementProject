package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.article;
import com.example.demo.entities.commandeClient;
import com.example.demo.entities.ligneCommande;
import com.example.demo.repository.CommandeClientRepository;
import com.example.demo.repository.articleRepository;
import com.example.demo.repository.ligneCCRepository;

@Service
public class LigneCClientService {
	
	
	
	
	@Autowired
	articleRepository articleRep;
	@Autowired
	ligneCCRepository lignecRep;
	@Autowired
	CommandeClientRepository ccR;
	 
	public ligneCommande addLignecc(ligneCommande lc ,Long idarticle , Long idcommande) {
		 
		article article = articleRep.findById(idarticle).get();
		lc.setArticle(article);
		commandeClient cc = ccR.findById(idcommande).get();
		lc.setCommandeClient(cc);
		
		return lignecRep.save(lc);
			
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
