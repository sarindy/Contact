package com.sarindy.contact.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sarindy.contact.model.Contact;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Integer> {

	public Contact findByFirstName(String firstName);

	public List<Contact> findByFirstNameLikeOrderByFirstName(String firstName);

	public Contact findByLastName(String lastName);

	public List<Contact> findByLastNameLikeOrderByLastName(String lastName);

	public Contact findByphoneNumber(String phoneNumber);

	public List<Contact> findByphoneNumberLike(String phoneNumber);

	public Contact findByemailAddress(String emailAddress);

	public List<Contact> findByemailAddressLike(String emailAddress);

}
