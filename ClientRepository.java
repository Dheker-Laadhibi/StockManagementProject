package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.article;
import com.example.demo.entities.client;
@Repository
public interface ClientRepository extends JpaRepository<client,Long> {
	client findByIdclient(Long id);
	  
	
}
