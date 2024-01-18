package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Auth;
import com.example.demo.repository.AuthRepository;

@Service
public class ImplAuthService implements AuthService{

    @Autowired
    private AuthRepository authRepository;

    @Override
    public Auth signUp(Auth request) {
        return authRepository.save(request);
    }

    @Override
   public Auth login(String email, String password) {
        return authRepository.findByEmailAndPassword(email, password);
    }


    public Optional<Auth> findById(int id) {
        return this.authRepository.findByCin(id);
    }

    @Override
    public List<Auth> findAll() {
        return authRepository.findAll();
    }


}

