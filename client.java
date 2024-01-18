package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idclient;
	private Integer numtel;
	private String nom;
	private String adresse;
	private Integer codepostal;
	private String pays;
	private String photo;


	public client(Long idclient, Integer numtel, String nom, String adresse, Integer codepostal, String pays,
			String photo) {
		super();
		this.idclient = idclient;
		this.numtel = numtel;
		this.nom = nom;
		this.adresse = adresse;
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





	public client() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Long getIdclient() {
		return idclient;
	}
	public void setIdclient(Long idclient) {
		this.idclient = idclient;
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
	@Override
	public String toString() {
		return "client [idclient=" + idclient + ", numtel=" + numtel + ", adresse=" + adresse + ", codepostal="
				+ codepostal + ", pays=" + pays + ", photo=" + photo + "]";
	}
	
	
	
	
	
	
	
}




