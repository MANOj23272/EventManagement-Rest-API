package com.springdatarest.EventmanagementApiApplication.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springdatarest.EventmanagementApiApplication.entities.Event;
import com.springdatarest.EventmanagementApiApplication.repos.EventRepository;

//@RestController
@RepositoryRestController
//@RequestMapping("/events")
public class EventKickOffController {

	@Autowired
	private EventRepository eventRepository;
	@PostMapping("/start/{id}")
	public ResponseEntity start(@PathVariable Long id) {
		Event event = eventRepository.findById(id).get();
		
		
//		Optional<Event> event = eventRepository.findById(id).get();
		if(event == null ) {
			throw new ResourceNotFoundException();
		}
		event.setStarted(true);
		eventRepository.save(event);
		return ResponseEntity.ok(event.getName()+" started");	
	}
 }
