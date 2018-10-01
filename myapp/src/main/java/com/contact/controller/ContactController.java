package com.contact.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.contact.model.Contact;
import com.contact.service.ContactService;

@Controller
public class ContactController {
	@Autowired
	private ContactService service;
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("contact", new Contact());
		return "index";
	}
	@PostMapping("/addContact")
	public String addContact(@Valid @ModelAttribute("contact") Contact contact, Errors errors,Model model) {
		if(errors.hasErrors())
		{
			return "index";
		}
		
		List<Contact> contacts = service.addcontact(contact);
		model.addAttribute("contacts",contacts);
		return "contacts";
	}
	@GetMapping("/showContacts")
	public String showContact(@ModelAttribute("contact") Contact contact, Model model) {
		List<Contact> contacts = service.showContacts();
		model.addAttribute("contacts",contacts);
		return "contacts";
	}
	@GetMapping("/deleteContact/{id}")
	public String deleteContact(@PathVariable int id,Model model) {
		service.deleteContact(id);
		List<Contact> contacts = service.showContacts();
		model.addAttribute("contacts",contacts);
		return "contacts";
	}
	
}
