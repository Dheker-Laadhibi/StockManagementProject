package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.article;
import com.example.demo.entities.categorie;
import com.example.demo.entities.client;
import com.example.demo.repository.ClientRepository;
@Service
public class clientService implements InterClient {

	@Autowired
	ClientRepository clRep;

	@Override
	public client addClient(client client) {
		// TODO Auto-generated method stub
		return clRep.save(client);
	}

	@Override
	public client updatecliClient(client client, Long idclient) {
		
		
		client cl = clRep.findById(idclient).get();
		cl.setAdresse(client.getAdresse());
		cl.setCodepostal(client.getCodepostal());
		cl.setNumtel(client.getNumtel());
		cl.setPays(client.getPays());
		client.setPhoto(client.getPhoto());
		cl.setNom(client.getNom());
		
		
		return clRep.save(cl);
	}

	@Override
	public void deleteclient(Long idclient) {
		  Optional<client> clientOptional = clRep.findById(idclient);
		    
		    if (clientOptional.isPresent()) {
		    	clRep.deleteById(idclient);
		        
		    } 
		
	}

	@Override
	public List<client> GetAllClients() {
		
		return clRep.findAll();
	}
	

	  public client getClientById(Long id) {
	        return clRep.findByIdclient(id);
	    }
	
	

	
}
