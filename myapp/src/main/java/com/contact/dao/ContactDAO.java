package com.contact.dao;

import java.util.List;

import com.contact.model.Contact;

public interface ContactDAO {
	void insertContact(Contact contact);
	List<Contact> getContacts();
	int removeContact(int id);
}