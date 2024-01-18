package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity


@Table(name = "auth")
public class Auth   {



    @Id

    @Column(name = "cin", length = 8, unique = true)
    private int cin;

    @Column(name = "email", length = 40, unique = true)

    private String email;

    @Column(name = "password" ,length = 75)

    private String password;

    @Column(name = "nom")

    private String nom;

    @Column(name = "prenom" ,length = 10)

    private String prenom;



    @Column(name = "ville",length = 10)

    private String ville;



    @Column(name = "codepostale",length = 4)

    private String codePostale;



    @Column(name = "pays",length = 10)

    private String pays;

    



	public Auth() {

		super();

	}



	public Auth(int cin, String email, String password, String nom, String prenom, String ville, String codePostale,

			String pays) {

		super();

		this.cin = cin;

		this.email = email;

		this.password = password;

		this.nom = nom;

		this.prenom = prenom;

		this.ville = ville;

		this.codePostale = codePostale;

		this.pays = pays;

	}



	public int getCin() {

		return cin;

	}



	public void setCin(int cin) {

		this.cin = cin;

	}



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
		return "Auth [cin=" + cin + ", email=" + email + ", password=" + password + ", nom=" + nom + ", prenom="
				+ prenom + ", ville=" + ville + ", codePostale=" + codePostale + ", pays=" + pays + "]";
	}







}

