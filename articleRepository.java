package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.article;
import java.util.List;
import java.util.Map;
@Repository
public interface articleRepository extends JpaRepository<article, Long> {
    article findByIdarticle(Long id);
	@Query("SELECT a.categorie.designation AS category, COUNT(a) AS count " +
		       "FROM article a GROUP BY a.categorie")
		List<Map<String, Long>> countArticlesByCategory();
	
    @Query("SELECT COUNT(DISTINCT a) FROM article a")
    Long countDistinctArticles();
	
	
}
