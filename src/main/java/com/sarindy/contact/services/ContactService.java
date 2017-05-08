package com.sarindy.contact.services;

import java.util.List;

import com.sarindy.contact.model.Contact;
import com.sarindy.responseCode.ResponseCodeModel;

public interface ContactService {

	public ResponseCodeModel addContact(Contact contact);
	
	public ResponseCodeModel updateContact(Contact contact);
	
	public List<Contact> getAllContact();
	
	

}
