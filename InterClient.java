package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.article;
import com.example.demo.entities.client;

public interface InterClient {

	
	

	public  client  addClient(client client  );


		public client updatecliClient(client client, Long idclient );

	
	public void deleteclient(Long idclient);


	public List<client>GetAllClients();

	
	
	
	
}
