package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.commandeClient;
@Repository
public interface CommandeClientRepository  extends JpaRepository<commandeClient, Long>{
	@Query("SELECT SUM(lc.quantitecommande * lc.prixtotal) FROM ligneCommande lc WHERE lc.commandeClient.idCommande = :commandeId")
	    Double calculateTotalForCommande(@Param("commandeId") Long commandeId);
}
