package com.contact.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contact.dao.ContactDAO;
import com.contact.model.Contact;

@Service
public class ContactServiceImp implements ContactService {
	
	@Autowired
	private ContactDAO dao;
	
	@Override
	public List<Contact> addcontact(Contact contact) {
		dao.insertContact(contact);
		return dao.getContacts();
	}

	@Override
	public List<Contact> showContacts() {
		return dao.getContacts();
	}

	@Override
	public void deleteContact(int id) {
		dao.removeContact(id);
		
	}

}
