package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entities.categorie;
import com.example.demo.service.categorieService;
@CrossOrigin(origins ="*")
@RestController
public class categorieController  {

	@Autowired
	categorieService catServ;
	
	// add article 
		@PostMapping(value="/addCatgorie")
		public categorie addUser(@RequestBody categorie cat) {
			return catServ.addCategorie(cat);
			
		}

	
	
		// update article
				@PostMapping(value="/Updatecategorie/{idcategorie}")
				public categorie UpdateArticle( @RequestBody categorie categorie ,@PathVariable Long idcategorie) {
					return   catServ.updatecategorie(categorie, idcategorie);
					
				}
	
	
				
				
				@DeleteMapping(value="/deletecategorie/{idcategorie}")
				public String  deleteUser(@PathVariable Long idcategorie) {
					return catServ.deleteCategorie(idcategorie);
				
				}
				/*
				//deleter user
		@DeleteMapping(value="/deleteUser/{iduser}")
		public String  deleteUser(@PathVariable Long iduser) {
			return userServ.deleteUser( iduser) ;
			
		}
		
		
		//get all users 
		@GetMapping(value = "/GetUsers")
		public List<User> GetallUsers(){
			return userServ.GetAllusers();
		}
		
			*/
	
	
				//get all users 
				 @CrossOrigin(origins = "http://localhost:4200") 
				@GetMapping(value = "/GetCategories")
				public List<categorie> GetallUsers(){
					return catServ.GetAllCategorie();
				}
	
				 @CrossOrigin(origins ="http://localhost:4200") 
				  @GetMapping("/category-count")
				    public Long getNumberOfCategories() {
				        return catServ.getNumberOfCategories();
				    }
				
	
	
	
	
	
	
	
	
	
	
	
	
	
}
