package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.StockMovement;

public interface StockMovementRepository extends JpaRepository<StockMovement, Long> {

}
