package com.example.demo.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.entities.article;
import com.example.demo.entities.categorie;
import com.example.demo.repository.CategorieRepository;
import com.example.demo.repository.articleRepository;



@Service
public class articleService implements InterArticleService {

	
	
	@Autowired
	articleRepository articleRep;
	@Autowired
	CategorieRepository catRep;
	 
	@Override
	public article addArticle(article article ,Long idcategorie) {
		 
		categorie cat = catRep.findById(idcategorie).get();
		article.setCategorie(cat);
		
		
		return articleRep.save(article);
			
		
	}


	@Override
	public article updatearticle(article article, Long idarticle ,Long idcategorie ) {
		 article article2 = articleRep.findById(idarticle).get();
		 categorie cat = catRep.findById(idcategorie).get();
		 
		 article2.setPhoto(article.getPhoto());
		 article2.setPrixunitaire(article.getPrixunitaire());
		 article2.setTauxtva(article.getTauxtva());
		 article2.setDesignation(article.getDesignation());
		 article2.setCodearticle(article.getCodearticle());
		 article2.setPrixunitairettc(article.getPrixunitairettc());
		article2.setCategorie(cat);
		 
		 
		 
		
		 
		return articleRep.save( article2);
	}


	@Override
	 @Transactional
	public void deleteArticle(Long idarticle) {
	    Optional<article> articleOptional = articleRep.findById(idarticle);
	    String ch="";
	    if (articleOptional.isPresent()) {
	        articleRep.deleteById(idarticle);
	        ch="deleted success";
	    } 
	}


	@Override
	public List<article> GetAllArticles() {

		return articleRep.findAll();
	}
	
	
	
	

	
	
	
	 public List<Map<String, Long>> getArticleCountByCategorie(){
		 
		 return articleRep.countArticlesByCategory();
	 }
	
	
	  public Long getNumberOfArticles() {
	        return articleRep.countDistinctArticles();
	    }
	
	
	  public article getArticleById(Long id) {
	        return articleRep.findByIdarticle(id);
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
