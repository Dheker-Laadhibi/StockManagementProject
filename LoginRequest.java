package com.example.demo.entities;

import javax.persistence.Entity;


public class LoginRequest {
	private String email;

   private String password;



    public String getEmail() {

        return email;

    }



    public String getPassword() {

        return password;

    }



    public void setPassword(String password) {

        this.password = password;

    }



    public void setEmail(String email) {

        this.email = email;

    }



	public LoginRequest(String email, String password) {

		super();

		this.email = email;

		this.password = password;

	}



	public LoginRequest() {

		super();

	}

    @Override
	public String toString() {
		return "LoginRequest [email=" + email + ", password=" + password + "]";
	}


}

