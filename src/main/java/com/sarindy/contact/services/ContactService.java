package com.sarindy.contact.services;

import com.sarindy.responseCode.ResponseCodeModel;

public interface ContactService {

	public ResponseCodeModel addContact(String title, String firstName, String lastName, String emailAddress, String phoneNumber, String address,
			int lastModifiedBy);
	
	public ResponseCodeModel updateContact(String title, String firstName, String lastName, String emailAddress, String phoneNumber, String address,
			int lastModifiedBy);
	
	

}
