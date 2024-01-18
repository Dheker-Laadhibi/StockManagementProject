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

import com.example.demo.entities.User;
import com.example.demo.entities.article;
import com.example.demo.entities.client;
import com.example.demo.service.clientService;

@CrossOrigin(origins = "*")
@RestController
public class clientController {
	@Autowired
	clientService clService;
	
	
	
	
	//add
	 @CrossOrigin(origins ="http://localhost:4200")
	@PostMapping(value="/ajouterClient")
	public client addArticle(@RequestBody client client) {
		return clService.addClient(client);
		
	}
	
	
	
	

	
	// update client  
	 @CrossOrigin(origins ="http://localhost:4200")
		@PostMapping(value="/UpdateClient/{idclient}")
		public client UpdateUser(@RequestBody client client ,@PathVariable Long idclient) {
			return clService.updatecliClient(client, idclient);
			
		}
	 //delete
		
		
	    @CrossOrigin(origins ="http://localhost:4200")
					@DeleteMapping(value="/deleteClient/{idclient}")
					public void deleteUser(@PathVariable Long idclient) {
					clService.deleteclient(idclient);
					return;
					
					}
	    //byid
	    @GetMapping("GetClient/{idclient}")
        public client getClientById(@PathVariable Long idclient) {
            return clService.getClientById(idclient);
        
        

        }
	    
	    
	    
	    @CrossOrigin(origins = "http://localhost:4200")
		@GetMapping(value = "/GetClients")
		public List<client> GetallClient(){
			return clService.GetAllClients();
		}

	
	

}
