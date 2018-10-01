package com.contact.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Contact {
	private int id;
	@NotNull(message="Field should not be empty")
	@Size(min=2,message="Name should have at least two characters")
	private String name;
	
	@NotNull(message="Field should not be empty")
	@Pattern(regexp="\\w+@\\w+\\.\\w+",message="Email is invalid")
	private String email;
	
	@NotNull(message="Field should not be empty")
	@Size(min=10,message="Phone number should have at least 10 digits")
	private String number;

	
	public Contact() {
		super();
	}
	public Contact(int id, String name, String email, String number) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.number = number;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
}
