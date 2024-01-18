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
public class commandeFournisseur {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long idCommande;
	    private String dateCommande;
	    private String codeCommande;
	    
	    
	    @ManyToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "idfournisseur")
	    private fournisseur fournisseur;
	    
	    @OneToMany(mappedBy ="commandeFournisseur", cascade = CascadeType.ALL)
	    private List<ligneFcommande> lignesCommande = new ArrayList<>();

		public commandeFournisseur() {
			super();
			// TODO Auto-generated constructor stub
		}

		public commandeFournisseur(Long idCommande, String dateCommande, String codeCommande,
				com.example.demo.entities.fournisseur fournisseur, List<ligneFcommande> lignesCommande) {
			super();
			this.idCommande = idCommande;
			this.dateCommande = dateCommande;
			this.codeCommande = codeCommande;
			this.fournisseur = fournisseur;
			this.lignesCommande = lignesCommande;
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

		public fournisseur getFournisseur() {
			return fournisseur;
		}

		public void setFournisseur(fournisseur fournisseur) {
			this.fournisseur = fournisseur;
		}

		public List<ligneFcommande> getLignesCommande() {
			return lignesCommande;
		}

		public void setLignesCommande(List<ligneFcommande> lignesCommande) {
			this.lignesCommande = lignesCommande;
		}

		@Override
		public String toString() {
			return "commandeFournisseur [idCommande=" + idCommande + ", dateCommande=" + dateCommande
					+ ", codeCommande=" + codeCommande + ", fournisseur=" + fournisseur + ", lignesCommande="
					+ lignesCommande + "]";
		}
	
	
	
	
	
	
	
	
	
	
	
	

}
