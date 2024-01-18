package com.example.demo.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.demo.entities.User;
import com.example.demo.entities.article;

public interface InterArticleService {
	
	
	
	
	public  article addArticle(article article , Long idcategorie  );


		public article updatearticle(article article, Long idarticle ,Long idcategorie );

	
	public void deleteArticle(Long idarticle);


	public List<article>GetAllArticles();

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
