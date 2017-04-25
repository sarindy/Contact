package com.sarindy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sarindy.contact.services.ContactServiceImpl;

@SpringBootApplication
public class ContactApplication implements CommandLineRunner {
	
	@Autowired
	private ContactServiceImpl contactServiceImpl;

	public static void main(String[] args) {
		SpringApplication.run(ContactApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		contactServiceImpl.addContact("Mr", "Sarindy", "Ouk", "sarindy@dnynn.com", "012719971", "Phnom Penh", 0);
		
	}
}
