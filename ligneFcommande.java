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
public class ligneFcommande {
	
	
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long idlignecommande;

	    private int quantitecommande;
	
	 private double prixtotal; 

 
	    @ManyToOne
	    @JoinColumn(name ="idCommande") 
	    @JsonIgnore
	    private commandeFournisseur commandeFournisseur;
	 
	 

	    @OneToOne
	    @JoinColumn(name = "idarticle")
	    private article article;



		public ligneFcommande() {
			super();
			// TODO Auto-generated constructor stub
		}



		public ligneFcommande(Long idlignecommande, int quantitecommande, double prixtotal,
				com.example.demo.entities.commandeFournisseur commandeFournisseur,
				com.example.demo.entities.article article) {
			super();
			this.idlignecommande = idlignecommande;
			this.quantitecommande = quantitecommande;
			this.prixtotal = prixtotal;
			this.commandeFournisseur = commandeFournisseur;
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



		public commandeFournisseur getCommandeFournisseur() {
			return commandeFournisseur;
		}



		public void setCommandeFournisseur(commandeFournisseur commandeFournisseur) {
			this.commandeFournisseur = commandeFournisseur;
		}



		public article getArticle() {
			return article;
		}



		public void setArticle(article article) {
			this.article = article;
		}



		@Override
		public String toString() {
			return "ligneFcommande [idlignecommande=" + idlignecommande + ", quantitecommande=" + quantitecommande
					+ ", prixtotal=" + prixtotal + ", commandeFournisseur=" + commandeFournisseur + ", article="
					+ article + "]";
		}

}
