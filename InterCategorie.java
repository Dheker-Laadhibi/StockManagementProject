package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.article;
import com.example.demo.entities.categorie;

public interface InterCategorie {
	
	

	public  categorie addCategorie(categorie categorie);


	public categorie updatecategorie (categorie categorie  , Long idcategorie  );

	
	public String deleteCategorie(Long idcategorie);


	public List<categorie>GetAllCategorie();


}
