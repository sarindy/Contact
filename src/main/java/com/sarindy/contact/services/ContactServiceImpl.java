package com.sarindy.contact.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
	public ResponseCodeModel addContact(Contact contact) {

		try {
			contact.setLastModifiedDate(new Date());
			contactRepository.save(contact);
			return new ResponseCodeModel("000", "Contact Added : by ", contact.getLastModifiedBy());

		} catch (Exception e) {
			logger.error(e.toString() + " " + e.getMessage());
			StackTraceElement[] elements = e.getStackTrace();
			String err = null;
			err = "Class Name:" + elements[0].getClassName() + " Method Name:" + elements[0].getMethodName() + " Line Number:"
					+ elements[0].getLineNumber();
			logger.error(err);
			return new ResponseCodeModel("999", "System Error : " + e.getMessage(), contact.getLastModifiedBy());
		}

	}

	@Override
	public ResponseCodeModel updateContact(Contact contact) {

		try {

			contactModel = contactRepository.findOne(contact.getId());
			if (contactModel == null) {
				logger.info(contact.getId() + " " + contact.getFirstName() + " not found");
				return new ResponseCodeModel("001", "Contact not found ", contact.getLastModifiedBy());
			}

			if (contact.getTitle() != null) {
				contactModel.setTitle(contact.getTitle());
			}

			if (contact.getFirstName() != null) {
				contactModel.setFirstName(contact.getFirstName());
			}
			if (contact.getLastName() != null) {
				contactModel.setLastName(contact.getLastName());
			}

			if (contact.getEmailAddress() != null) {
				contactModel.setEmailAddress(contact.getEmailAddress());
			}

			if (contact.getPhoneNumber() != null) {
				contactModel.setPhoneNumber(contact.getPhoneNumber());
			}

			if (contact.getLastModifiedBy() != 0) {
				contactModel.setLastModifiedBy(contact.getLastModifiedBy());
			}

			if (contact.getAddress() != null) {
				contactModel.setAddress(contact.getAddress());
			}
			contactModel.setLastModifiedDate(new Date());

			contactRepository.save(contactModel);

			return new ResponseCodeModel("000", "Contact Added : by ", contact.getLastModifiedBy());

		} catch (Exception e) {
			logger.error(e.toString() + " " + e.getMessage());
			StackTraceElement[] elements = e.getStackTrace();
			String err = null;
			err = "Class Name:" + elements[0].getClassName() + " Method Name:" + elements[0].getMethodName() + " Line Number:"
					+ elements[0].getLineNumber();
			logger.error(err);
			return new ResponseCodeModel("999", "System Error : " + e.getMessage(), contact.getLastModifiedBy());
		}
	}

	@Override
	public List<Contact> getAllContact() {
		List<Contact> contact =new ArrayList<>();
		contactRepository.findAll().forEach(contact::add);
		
		
		return contact;
	}

}
