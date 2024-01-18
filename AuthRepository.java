package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Auth;

@Repository
public interface AuthRepository extends JpaRepository<Auth, Integer> {
    Auth findByEmailAndPassword(String email, String password);
    Optional<Auth> findByCin(int cin);


}
