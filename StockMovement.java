package com.example.demo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class StockMovement {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String date;
    private int quantity;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idCommandeClient", referencedColumnName = "idCommande") // Colonne pour la commande client
    private commandeClient commandeClient; 
    @ManyToOne
    @JoinColumn(name = "idCommandeFournisseur", referencedColumnName = "idCommande") // Colonne pour la commande fournisseur
    private commandeFournisseur commandeFournisseur;
    
    private String movementType;
    
    
    
	public commandeClient getCommandeClient() {
		return commandeClient;
	}
	public void setCommandeClient(commandeClient commandeClient) {
		this.commandeClient = commandeClient;
	}
	public commandeFournisseur getCommandeFournisseur() {
		return commandeFournisseur;
	}
	public void setCommandeFournisseur(commandeFournisseur commandeFournisseur) {
		this.commandeFournisseur = commandeFournisseur;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getMovementType() {
		return movementType;
	}
	public void setMovementType(String movementType) {
		this.movementType = movementType;
	}

	public StockMovement(Long id, String date, int quantity, com.example.demo.entities.commandeClient commandeClient,
			com.example.demo.entities.commandeFournisseur commandeFournisseur, String movementType) {
		super();
		this.id = id;
		this.date = date;
		this.quantity = quantity;
		this.commandeClient = commandeClient;
		this.commandeFournisseur = commandeFournisseur;
		this.movementType = movementType;
	}
	public StockMovement() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	@Override
	public String toString() {
		return "StockMovement [id=" + id + ", date=" + date + ", quantity=" + quantity + ", commandeClient="
				+ commandeClient + ", commandeFournisseur=" + commandeFournisseur + ", movementType=" + movementType
				+ "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
