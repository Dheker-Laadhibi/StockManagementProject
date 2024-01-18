package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.article;
import com.example.demo.entities.categorie;
import com.example.demo.repository.CategorieRepository;
@Service

public class categorieService implements InterCategorie {

	@Autowired
	CategorieRepository catRep;

	@Override
	public categorie addCategorie(categorie categorie) {
		// TODO Auto-generated method stub
		return catRep.save(categorie);
	}

	@Override
	public categorie updatecategorie(categorie categorie, Long idcategorie) {
		categorie cat = catRep.findById(idcategorie).get();
		cat.setCodecategorie(categorie.getCodecategorie());
		cat.setDesignation(categorie.getDesignation());
	
		return  catRep.save(cat);
	}

	@Override
	public String deleteCategorie(Long idcategorie) {
	
		 String	ch="";
			
		  Optional<categorie> articleOptional = catRep.findById(idcategorie);
		    
		    if (articleOptional.isPresent()) {
		       
		        catRep.deleteById(idcategorie);
		        ch = "Utilisateur supprimé avec succès";
		    } else {
		       
		        ch = "Utilisateur non trouvé avec l'ID : " + idcategorie;
		    }
		    
		    return ch;
		
	}

	@Override
	public List<categorie> GetAllCategorie() {
		// TODO Auto-generated method stub
		return catRep.findAll();
	}
	
	
	
	
	  public Long getNumberOfCategories() {
	        return catRep.countDistinctCategories();
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
