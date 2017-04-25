package com.sarindy.contact.services;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sarindy.contact.model.Contact;
import com.sarindy.contact.repository.ContactRepository;
import com.sarindy.responseCode.ResponseCodeModel;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactRepository;

	@Autowired
	private Contact contactModel;

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public ResponseCodeModel addContact(String title, String firstName, String lastName, String emailAddress, String phoneNumber, String address,
			int lastModifiedBy) {

		try {
			contactModel.setTitle(title);
			contactModel.setFirstName(firstName);
			contactModel.setLastName(lastName);
			contactModel.setEmailAddress(emailAddress);
			contactModel.setPhoneNumber(phoneNumber);
			contactModel.setAddress(address);
			contactModel.setLastModifiedBy(lastModifiedBy);
			contactModel.setLastModifiedDate(new Date());
			contactRepository.save(contactModel);
			return new ResponseCodeModel("000", "Contact Added : by ", lastModifiedBy);

		} catch (Exception e) {
			logger.error(e.toString() + " " + e.getMessage());
			StackTraceElement[] elements = e.getStackTrace();
			String err = null;
			err = "Class Name:" + elements[0].getClassName() + " Method Name:" + elements[0].getMethodName() + " Line Number:"
					+ elements[0].getLineNumber();
			logger.error(err);
			return new ResponseCodeModel("999", "System Error : " + e.getMessage(), lastModifiedBy);
		}

	}

	@Override
	public ResponseCodeModel updateContact(String title, String firstName, String lastName, String emailAddress, String phoneNumber, String address,
			int lastModifiedBy) {

		// TODO Auto-generated method stub
		return null;
	}

}
