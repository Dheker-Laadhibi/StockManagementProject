package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class fournisseur {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idfournisseur;
	private Integer numtel;
	private String adresse;
	private String nom;
	private Integer codepostal;
	private String pays;
	private String photo;
	
	
	public fournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}





	public fournisseur(Long idfournisseur, Integer numtel, String adresse, String nom, Integer codepostal, String pays,
			String photo) {
		super();
		this.idfournisseur = idfournisseur;
		this.numtel = numtel;
		this.adresse = adresse;
		this.nom = nom;
		this.codepostal = codepostal;
		this.pays = pays;
		this.photo = photo;
	}





	
	public String getNom() {
		return nom;
	}





	public void setNom(String nom) {
		this.nom = nom;
	}





	@Override
	public String toString() {
		return "fournisseur [idfournisseur=" + idfournisseur + ", numtel=" + numtel + ", adresse=" + adresse
				+ ", codepostal=" + codepostal + ", pays=" + pays + ", photo=" + photo + "]";
	}


	public Long getIdfournisseur() {
		return idfournisseur;
	}


	public void setIdfournisseur(Long idfournisseur) {
		this.idfournisseur = idfournisseur;
	}


	public Integer getNumtel() {
		return numtel;
	}


	public void setNumtel(Integer numtel) {
		this.numtel = numtel;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public Integer getCodepostal() {
		return codepostal;
	}


	public void setCodepostal(Integer codepostal) {
		this.codepostal = codepostal;
	}


	public String getPays() {
		return pays;
	}


	public void setPays(String pays) {
		this.pays = pays;
	}


	public String getPhoto() {
		return photo;
	}


	public void setPhoto(String photo) {
		this.photo = photo;
	}

	  
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
