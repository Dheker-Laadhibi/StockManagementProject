package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.commandeFournisseur;
import com.example.demo.entities.fournisseur;

public interface CommandeFournisseurRepository extends JpaRepository<commandeFournisseur, Long> {
	@Query("SELECT SUM(lc.quantitecommande * lc.prixtotal) FROM ligneFcommande lc WHERE lc.commandeFournisseur.idCommande = :commandeId")
    Double calculateTotalForCommande(@Param("commandeId") Long commandeId);
}
