package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.event;
import com.example.demo.service.EventService;

@RestController
public class eventController {

	
	@Autowired
	EventService eventServ;
	@GetMapping(value = "/GetEvents")
	  @CrossOrigin(origins = "http://localhost:4200")
	    public List<event> getAllEvents() {
	        return eventServ.getAllEvents();
	    }

	
	
	
	
	
	
	
}
