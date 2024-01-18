package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class ligneCommande {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long idlignecommande;

	    private int quantitecommande;
	
	 private double prixtotal; 

    
	    @ManyToOne
	    @JoinColumn(name ="idCommande") 
	    @JsonIgnore
	    private commandeClient commandeClient;
	 
	 

	    @OneToOne
	    @JoinColumn(name = "idarticle")
	    private article article;





	public ligneCommande(Long idlignecommande, int quantitecommande, double prixtotal,
			com.example.demo.entities.commandeClient commandeClient, com.example.demo.entities.article article) {
		super();
		this.idlignecommande = idlignecommande;
		this.quantitecommande = quantitecommande;
		this.prixtotal = prixtotal;
		this.commandeClient = commandeClient;
		this.article = article;
	}



	public Long getIdlignecommande() {
		return idlignecommande;
	}



	public void setIdlignecommande(Long idlignecommande) {
		this.idlignecommande = idlignecommande;
	}



	public int getQuantitecommande() {
		return quantitecommande;
	}



	public void setQuantitecommande(int quantitecommande) {
		this.quantitecommande = quantitecommande;
	}



	public double getPrixtotal() {
		return prixtotal;
	}



	public void setPrixtotal(double prixtotal) {
		this.prixtotal = prixtotal;
	}



	public article getArticle() {
		return article;
	}



	public void setArticle(article article) {
		this.article = article;
	}



	public commandeClient getCommandeClient() {
		return commandeClient;
	}



	public void setCommandeClient(commandeClient commandeClient) {
		this.commandeClient = commandeClient;
	}



	public ligneCommande() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "ligneCommande [idlignecommande=" + idlignecommande + ", quantitecommande=" + quantitecommande
				+ ", prixtotal=" + prixtotal + ", commandeClient=" + commandeClient + ", article=" + article
				+ ", getIdlignecommande()=" + getIdlignecommande() + ", getQuantitecommande()=" + getQuantitecommande()
				+ ", getPrixtotal()=" + getPrixtotal() + ", getArticle()=" + getArticle() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}



	

	 














}












