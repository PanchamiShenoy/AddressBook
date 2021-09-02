package com.yml.book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("welcome to address book program");
		List<Contacts> contactList = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first name");
		String firstName = sc.nextLine();
		System.out.println("enter the last name");
		String lastName = sc.nextLine();
		System.out.println("enter the addres");
		String address = sc.nextLine();
		System.out.println("enter the city");
		String city = sc.nextLine();
		System.out.println("enter the state");
		String state = sc.nextLine();
		System.out.println("enter the zip code");
		String zip = sc.nextLine();
		System.out.println("enter the phone Number");
		String phoneNumber = sc.nextLine();
		System.out.println("enter the email");
		String email = sc.nextLine();

		Contacts c = new Contacts(firstName, lastName, address, city, state, zip, phoneNumber, email);

		contactList.add(c);

		c.display();

	}

}
