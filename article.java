package com.example.demo.entities;



import java.io.Serializable;
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

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class article  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private   Long idarticle;
	private String   codearticle;
	   private       float     prixunitaire;
	   private  float tauxtva;
	   private  float prixunitairettc ;
	   private String photo;
	   private String designation;
	   /*
	  @JsonIgnore
	   @JoinColumn(name = "categorie_idcategorie")
	   @ManyToOne
	  private categorie categorie;
	*/
	   
	   
	   @JoinColumn(name = "categorie_idcategorie")
	   @ManyToOne
	  private categorie categorie;
	   
	
	public article() {
		super();
		// TODO Auto-generated constructor stub
	}



	
	


	public article(Long idarticle, String codearticle, float prixunitaire, float tauxtva, float prixunitairettc,
			String photo, String designation, com.example.demo.entities.categorie categorie
			) {
		super();
		this.idarticle = idarticle;
		this.codearticle = codearticle;
		this.prixunitaire = prixunitaire;
		this.tauxtva = tauxtva;
		this.prixunitairettc = prixunitairettc;
		this.photo = photo;
		this.designation = designation;
		this.categorie = categorie;
		
	}









	public Long getIdarticle() {
		return idarticle;
	}
	public void setIdarticle(Long idarticle) {
		this.idarticle = idarticle;
	}
	public String getCodearticle() {
		return codearticle;
	}
	public void setCodearticle(String codearticle) {
		this.codearticle = codearticle;
	}
	public float getPrixunitaire() {
		return prixunitaire;
	}
	public void setPrixunitaire(float prixunitaire) {
		this.prixunitaire = prixunitaire;
	}
	public float getTauxtva() {
		return tauxtva;
	}
	public void setTauxtva(float tauxtva) {
		this.tauxtva = tauxtva;
	}
	public float getPrixunitairettc() {
		return prixunitairettc;
	}
	public void setPrixunitairettc(float prixunitairettc) {
		this.prixunitairettc = prixunitairettc;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(categorie categorie) {
		this.categorie = categorie;
	}
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "article [idarticle=" + idarticle + ", codearticle=" + codearticle + ", prixunitaire=" + prixunitaire
				+ ", tauxtva=" + tauxtva + ", prixunitairettc=" + prixunitairettc + ", photo=" + photo
				+ ", designation=" + designation + ", categorie=" + categorie 
				+ "]";
	}	 
}
