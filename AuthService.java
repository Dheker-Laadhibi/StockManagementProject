package com.example.demo.service;

import com.example.demo.entities.Auth;

import java.util.List;
import java.util.Optional;

public interface AuthService {
    Auth signUp(Auth auth);
    Auth login(String email, String password);
    Optional<Auth> findById(int id);
    List<Auth> findAll();

}