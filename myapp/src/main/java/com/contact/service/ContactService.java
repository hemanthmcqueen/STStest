package com.contact.service;

import java.util.List;

import com.contact.model.Contact;

public interface ContactService {
	List<Contact> addcontact(Contact contact);
	List<Contact> showContacts();
	void deleteContact(int id);
}