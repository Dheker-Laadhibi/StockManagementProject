package com.example.demo.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class categorie implements Serializable  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcategorie ;
	private String codecategorie;
	private String designation;
	
	/*mappedBy: This attribute is used in the owning side of a bidirectional relationship to specify the field in the associated entity that owns the relationship. In the provided example:*/
	/* cascade mean if an operation (like persist, merge, remove, etc.) is applied to a cccategorie entity, the same operation will be cascaded to its associated Article*/

	
	public categorie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public categorie(Long idcategorie, String codecategorie, String designation, List<article> articles) {
		super();
		this.idcategorie = idcategorie;
		this.codecategorie = codecategorie;
		this.designation = designation;
		/*
		this.articles = articles;*/
	}

	public Long getIdcategorie() {
		return idcategorie;
	}
	public void setIdcategorie(Long idcategorie) {
		this.idcategorie = idcategorie;
	}
	public String getCodecategorie() {
		return codecategorie;
	}
	public void setCodecategorie(String codecategorie) {
		this.codecategorie = codecategorie;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	/*
	public List<article> getProducts() {
		return articles;
	}
	public void setProducts(List<article> products) {
		this.articles = products;
	}*/
	@Override
	public String toString() {
		return "categorie [idcategorie=" + idcategorie + ", codecategorie=" + codecategorie + ", designation="
				+ designation + ", products=" +/* articles*/  "]";
	}

	
	
	
	
	
	
	






}
