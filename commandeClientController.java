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

import com.example.demo.entities.article;
import com.example.demo.entities.commandeClient;
import com.example.demo.service.CommandeClientService;

@RestController
public class commandeClientController {
	
	   @Autowired
	      CommandeClientService cls;
	   
	   
	   @CrossOrigin(origins = "http://localhost:4200")
		@PostMapping(value="/ajoutercommandeClient/{idclient}")
		public commandeClient addArticle(@RequestBody commandeClient cc , @PathVariable Long idclient) {
			return cls.addCommandeClient(cc,idclient);
			
		}
	   /*
	   @CrossOrigin(origins = "http://localhost:4200")
	   @GetMapping("/commandes/{commandeId}")
	    public void getTotalCommande(@PathVariable Long commandeId) {
	        return cls.getTotalCommandeByCommandeId(commandeId);
	    }
	*/
	   @CrossOrigin(origins = "http://localhost:4200")
		@GetMapping(value = "/GetAllCommandes")
		public List<commandeClient> GetAllCommandes(){
			return cls.GetAllCommandes();
		}
		   @CrossOrigin(origins = "http://localhost:4200")
		   @GetMapping("prixtot/{commandeId}")
		   public Double calculateTotalForCommande(@PathVariable Long commandeId) {
		       return cls.getTotalForCommande(commandeId);
		   }
		   
		   
		    @CrossOrigin(origins ="http://localhost:4200")
						@DeleteMapping(value="/deletecommande/{idcommande}")
						public void deleteUser(@PathVariable Long idclient) {
						cls.deleteCommande(idclient);
						return;
						
						}
		    //byid
		   

}
