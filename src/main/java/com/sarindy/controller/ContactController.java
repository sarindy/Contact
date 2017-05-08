package com.sarindy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sarindy.contact.model.Contact;
import com.sarindy.contact.services.ContactServiceImpl;
import com.sarindy.responseCode.ResponseCodeModel;

@RestController
public class ContactController {

	@Autowired
	private ContactServiceImpl contactServiceImpl;

	@RequestMapping(value = "/api/addContact", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseCodeModel addContact(@RequestBody Contact contact) {
		return contactServiceImpl.addContact(contact);
	}

	@RequestMapping(value = "/getAllContact", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<List<Contact>> ContactllContact() {
		return new ResponseEntity<List<Contact>>(contactServiceImpl.getAllContact(), HttpStatus.OK);
	}

}
