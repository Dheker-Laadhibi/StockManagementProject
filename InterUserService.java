package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.User;

public interface InterUserService  {
public  User addUser(User user );

public  String addUserwTESTConfirlm(User user );

public  String addUserwTESTuser(User user );



public User updateUser(User user , Long iduser );


public String deleteUser(Long iduser);


public List<User>GetAllusers();




}
