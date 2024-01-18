package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.entities.article;
import com.example.demo.service.articleService;
import com.example.demo.service.categorieService;
@CrossOrigin(origins = "*")
@RestController
public class articleController {

	@Autowired
	articleService artService;

	
	
	// add article
	@CrossOrigin(origins = "http://localhost:4200")
		@PostMapping(value="/ajouterArticleCat/{idcategorie}")
		public article addArticle(@RequestBody article art , @PathVariable Long idcategorie) {
			return artService.addArticle(art,idcategorie);
			
		}

	
	
		// update article
	@CrossOrigin(origins = "http://localhost:4200")
				@PostMapping(value="/UpdateArticle/{idarticle}/{idcategorie}")
				public article UpdateArticle( @RequestBody article article ,@PathVariable Long idarticle ,@PathVariable Long idcategorie) {
					return   artService.updatearticle(article, idarticle, idcategorie);
					
				}
	
	
				
	       @CrossOrigin(origins ="http://localhost:4200")
				@DeleteMapping(value="/deleteArticle/{idarticle}")
				public void deleteUser(@PathVariable Long idarticle) {
					artService.deleteArticle(idarticle);
				return;
				}
			
	
	
				//get all users 
	        @CrossOrigin(origins = "http://localhost:4200")
				@GetMapping(value = "/GetArticles")
				public List<article> GetallUsers(){
					return artService.GetAllArticles();
				}
	
		           @CrossOrigin(origins = "http://localhost:4200")
				   @GetMapping("/count-by-category")
				    public List<Map<String, Long>> getArticleCountByCategory() {
				        return artService.getArticleCountByCategorie();
				    }
		           @CrossOrigin(origins ="http://localhost:4200")
		           @GetMapping("/article-count")
		           public Long getNumberOfArticles() {
		               return artService.getNumberOfArticles();
		           }
		           
		           
		           @GetMapping("/articles/{id}")
		           public article getArticleById(@PathVariable Long id) {
		               return artService.getArticleById(id);
	
		           
		           
	
		           }
}
