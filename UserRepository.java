package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long>  {
	Boolean existsByNom(String Nom);
	 @Query("SELECT COUNT(DISTINCT u) FROM User u")
	    Long countDistinctUsers();



}
