package com.sarindy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sarindy.contact.services.ContactServiceImpl;

@RestController
public class MyController {
	
	@Autowired
	private ContactServiceImpl contactServiceImpl;
	
	@RequestMapping("/")
	public String index(){
		contactServiceImpl.addContact("Mr", "Sarindy", "Ouk", "sarindy@dnynn.com", "012719971", "Phnom Penh", 0);
		return "Hello";
	}

}
