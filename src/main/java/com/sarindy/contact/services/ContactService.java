package com.sarindy.contact.services;

import java.util.List;

import com.sarindy.contact.model.Contact;
import com.sarindy.responseCode.ResponseCodeModel;

public interface ContactService {

	public ResponseCodeModel addContact(String title, String firstName, String lastName, String emailAddress, String phoneNumber, String address,
			int lastModifiedBy);
	
	public ResponseCodeModel updateContact(Contact contact);
	
	public List<Contact> getAllContact();
	
	

}
