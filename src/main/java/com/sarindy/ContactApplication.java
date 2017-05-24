package com.sarindy;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class ContactApplication extends SpringBootServletInitializer implements CommandLineRunner {
	//public class ContactApplication extends SpringBootServletInitializer implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(ContactApplication.class, args);
	}
	
	

	@Override
	public void run(String... args) throws Exception {

		//contactServiceImpl.addContact("Mr", "Sarindy", "Ouk", "sarindy@dnynn.com", "012719971", "Phnom Penh", 0);
		//contactModel.setId(2);
		//contactModel.setAddress("Battambang");

		//responseCodeModel = contactServiceImpl.updateContact(contactModel);
		//System.out.println(responseCodeModel.toString());

	}

	
}
