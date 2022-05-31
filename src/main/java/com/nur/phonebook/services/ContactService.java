package com.nur.phonebook.services;

import java.util.List;

import com.nur.phonebook.entities.Contact;

public interface ContactService {
	
	String upsert(Contact contact);
	
	List<Contact> getAllContacts();
	
	Contact getContact(int cid);
	
	String deleteContact(int cid);

}
