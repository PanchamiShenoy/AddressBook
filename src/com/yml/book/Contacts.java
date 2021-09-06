package com.yml.book;

import java.util.ArrayList;
import java.util.List;

public class Contacts {
	
	public String firstName, lastName, address, city, state, zip, phoneNumber, email;
	List<Contacts> contactList = new ArrayList<>();

	Contacts() {

	}

	public Contacts(String firstName, String lastName, String address, String city, String state, String zip,
			String phoneNumber, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public void display() {
		System.out.println("First Name:" + firstName);
		System.out.println("Last Name:" + lastName);
		System.out.println("Address:" + address);
		System.out.println("City:" + city);
		System.out.println("State:" + state);
		System.out.println("Zip:" + zip);
		System.out.println("Phone number" + phoneNumber);
		System.out.println("E-mail:" + email);
	}
}
