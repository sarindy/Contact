package com.sarindy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sarindy.contact.model.Contact;
import com.sarindy.contact.services.ContactServiceImpl;

@RestController
public class ContactController {
	
	@Autowired
	private ContactServiceImpl contactServiceImpl;
	
	@RequestMapping("/")
	public String index(){
		contactServiceImpl.addContact("Mr", "Sarindy", "Ouk", "sarindy@dnynn.com", "012719971", "Phnom Penh", 0);
		return "Hello";
	}
	
	@RequestMapping(value="/getAllContact",produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<List<Contact>>ContactllContact(){
		return new ResponseEntity<List<Contact>>(contactServiceImpl.getAllContact(),HttpStatus.OK);
	}

}
