package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.event;
import com.example.demo.repository.EventRepository;
@Service
public class EventService {

	
	@Autowired
	EventRepository eventRep;
	
	
	

    public List<event> getAllEvents() {
        return eventRep.findAll();
    }

	
	
	
	
	
	
	
}
