package com.lectorium.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lectorium.model.Publisher;
import com.lectorium.service.PublisherServiceImpl;

import lombok.AllArgsConstructor;

// https://localhost:9090/publishers
@RestController
@RequestMapping("/publishers")
@AllArgsConstructor
public class PublisherController {
	//@Autowired
	private PublisherServiceImpl service;
	
	@GetMapping
	public List<Publisher> findAll() throws Exception{
		return service.findAll();
	}
	/*
	public PublisherController(PublisherServiceImpl service) {
		this.service = service;
	}
	*/

	/*
	@GetMapping
	public Publisher savePublisher() {
		//service = new PublisherService();
		return service.saveAndValid(new Publisher());
	}
	*/
	/*
	@GetMapping
	public Publisher showPublisher() {
		Publisher publisher = new Publisher();
		publisher.setIdPublisher(1);
		publisher.setName("UPN");
		return publisher;
	}
	*/
	
}
