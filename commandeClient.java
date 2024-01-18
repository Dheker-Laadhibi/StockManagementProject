package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class commandeClient {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long idCommande;
	    private String dateCommande;
	    private String codeCommande;
	    
	    
	    
	  
	    @ManyToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "idclient")
	    private client client;
	    
	    
	    @OneToMany(mappedBy ="commandeClient", cascade = CascadeType.ALL)
	    private List<ligneCommande> lignesCommande = new ArrayList<>();

		public commandeClient() {
			super();
			// TODO Auto-generated constructor stub
		}
	
	

		
		
		
	






	




		public commandeClient(Long idCommande, String dateCommande, String codeCommande,
				List<StockMovement> stockMovements, com.example.demo.entities.client client,
				List<ligneCommande> lignesCommande) {
			super();
			this.idCommande = idCommande;
			this.dateCommande = dateCommande;
			this.codeCommande = codeCommande;
			
			this.client = client;
			this.lignesCommande = lignesCommande;
		}







		public client getClient() {
			return client;
		}

		public void setClient(client client) {
			this.client = client;
		}

		public Long getIdCommande() {
			return idCommande;
		}
		public void setIdCommande(Long idCommande) {
			this.idCommande = idCommande;
		}
		public String getDateCommande() {
			return dateCommande;
		}
		public void setDateCommande(String dateCommande) {
			this.dateCommande = dateCommande;
		}
		public String getCodeCommande() {
			return codeCommande;
		}
		public void setCodeCommande(String codeCommande) {
			this.codeCommande = codeCommande;
		}
		public List<ligneCommande> getLignesCommande() {
			return lignesCommande;
		}
		public void setLignesCommande(List<ligneCommande> lignesCommande) {
			this.lignesCommande = lignesCommande;
		}







		@Override
		public String toString() {
			return "commandeClient [idCommande=" + idCommande + ", dateCommande=" + dateCommande + ", codeCommande="
					+ codeCommande + ", stockMovements=" +   ", client=" + client + ", lignesCommande="
					+ lignesCommande + "]";
		}

		


}
