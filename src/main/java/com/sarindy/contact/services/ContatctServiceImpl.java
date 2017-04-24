package com.sarindy.contact.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.sarindy.contact.repository.ContactRepository;
import com.sarindy.responseCode.ResponseCodeModel;


public class ContatctServiceImpl implements ContactService {
	
	@Autowired
	private ContactRepository contactRepository;
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public ResponseCodeModel addContact(String title, String firstName, String lastName, String emailAddress, String phoneNumber, String address,
			int lastModifiedBy) {

		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseCodeModel updateContact(String title, String firstName, String lastName, String emailAddress, String phoneNumber, String address,
			int lastModifiedBy) {

		// TODO Auto-generated method stub
		return null;
	}

}
