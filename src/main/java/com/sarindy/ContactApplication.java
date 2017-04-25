package com.sarindy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sarindy.contact.model.Contact;
import com.sarindy.contact.services.ContactServiceImpl;
import com.sarindy.responseCode.ResponseCodeModel;

@SpringBootApplication
public class ContactApplication implements CommandLineRunner {

	@Autowired
	private ContactServiceImpl contactServiceImpl;

	@Autowired
	private Contact contactModel;

	@Autowired
	private ResponseCodeModel responseCodeModel;

	public static void main(String[] args) {

		SpringApplication.run(ContactApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		 contactServiceImpl.addContact("Mr", "Sarindy", "Ouk",
		 "sarindy@dnynn.com", "012719971", "Phnom Penh", 0);
		contactModel.setId(2);
		contactModel.setAddress("Battambang");

		//responseCodeModel = contactServiceImpl.updateContact(contactModel);
		System.out.println(responseCodeModel.toString());

	}
}
