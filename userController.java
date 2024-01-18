package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.service.userService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class userController {
	@Autowired
	userService userServ;
	

	// add user 
	@PostMapping(value="/addUser")
	public User addUser(@RequestBody User user) {
		return userServ.addUser(user) ;
		
	}

	
	
	// add user with test on password and confirm password 
	@PostMapping(value="/testconfirm")
	public String addUserWithTest(@RequestBody User user) {
		return userServ.addUserwTESTConfirlm(user) ;
		
	}
	
	
	// add user with test on password and confirm password 
	@PostMapping(value="/testNom")
	public String addUserWithTestNOM(@RequestBody User user) {
		return userServ.addUserwTESTuser(user) ;
		
	}
	
	
	
	
	// update user 
		@PostMapping(value="/UpdateUsr/{iduser}")
		public User UpdateUser(@RequestBody User user ,@PathVariable Long iduser) {
			return userServ.updateUser(user, iduser) ;
			
		}
		
		
		//deleter user
		@DeleteMapping(value="/deleteUser/{iduser}")
		public String  deleteUser(@PathVariable Long iduser) {
			return userServ.deleteUser( iduser) ;
			
		}
		
		
		//get all users 
		@GetMapping(value = "/GetUsers")
		public List<User> GetallUsers(){
			return userServ.GetAllusers();
		}
		 @CrossOrigin(origins ="http://localhost:4200") 
		 @GetMapping("/user-count")
		    public Long getNumberOfUsers() {
		        return userServ.getNumberOfUsers();
		    }
		
		
		
	
	
}
