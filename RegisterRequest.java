package com.example.demo.entities;

import javax.persistence.Entity;

public class RegisterRequest {

    private String email;

    private String password;

    private int cin;

    private String nom;

    private String prenom;

    private String ville; 	

    private String codePostale;

    private String pays;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getCin() {
		return cin;
	}

	public void setCin(int cin) {
		this.cin = cin;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getCodePostale() {
		return codePostale;
	}

	public void setCodePostale(String codePostale) {
		this.codePostale = codePostale;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	@Override
	public String toString() {
		return "RegisterRequest [email=" + email + ", password=" + password + ", cin=" + cin + ", nom=" + nom
				+ ", prenom=" + prenom + ", ville=" + ville + ", codePostale=" + codePostale + ", pays=" + pays + "]";
	}

	public RegisterRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegisterRequest(String email, String password, int cin, String nom, String prenom, String ville,
			String codePostale, String pays) {
		super();
		this.email = email;
		this.password = password;
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.ville = ville;
		this.codePostale = codePostale;
		this.pays = pays;
	}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}