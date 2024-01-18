package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.categorie;

@Repository
public interface CategorieRepository extends JpaRepository<categorie,Long> {
	
	   @Query("SELECT COUNT(DISTINCT c) FROM categorie c")
	    Long countDistinctCategories();
	
	
	
	

}
