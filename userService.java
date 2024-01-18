package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.repository.UserRepository;
@Service
public class userService implements InterUserService {

	
	@Autowired
	UserRepository useRep;
	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return useRep.save(user);
	}
	@Override
	public String addUserwTESTConfirlm(User user) {
		
		String ch = "" ;
		if(!user.getPassword().equals(user.getConfirm())) {
			ch="check password or confirm paasword ";
		}
	else {
		useRep.save(user);
		ch="user    added   ";
	}
			
		
		return ch;
	}
	//test on name of user if it's exits or not 
	
	
	@Override
	public String addUserwTESTuser(User user) {
		 String ch="";
		if(		useRep.existsByNom(user.getNom())) {
			ch="user already exists";
		}
		else {
			useRep.save(user);
			ch="user added with success";
		}
		return ch;
	}
	
	
	//update 
	
	
	@Override
	public User updateUser(User user, Long iduser) {
		User usr = useRep.findById(iduser).get();
	
		usr.setAdresse1(user.getAdresse1());
		usr.setAdresse2(user.getAdresse2());
		usr.setNom(user.getNom());
		usr.setEmail(user.getEmail());
		usr.setVille(user.getVille());
		usr.setPays(user.getPays());
		
		return useRep.save(usr);
	}
	
	//delete
	@Override
	public String deleteUser(Long iduser) {
		// TODO Auto-generated method stub
	 String	ch="";
		
		  Optional<User> userOptional = useRep.findById(iduser);
		    
		    if (userOptional.isPresent()) {
		        // Si l'utilisateur avec cet ID existe, supprimez-le
		        useRep.deleteById(iduser);
		        ch = "Utilisateur supprimé avec succès";
		    } else {
		        // Si l'utilisateur avec cet ID n'existe pas
		        ch = "Utilisateur non trouvé avec l'ID : " + iduser;
		    }
		    
		    return ch;
		}
	@Override
	public List<User> GetAllusers() {
		// TODO Auto-generated method stub
		return useRep.findAll();
	}
	
	 public Long getNumberOfUsers() {
	        return useRep.countDistinctUsers();
	    }
	
}
