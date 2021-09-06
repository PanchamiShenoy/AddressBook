package com.yml.book;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("welcome to address book program");
		Hashtable<String, Contacts> multipleAddressBook = new Hashtable<String, Contacts>();
		Contacts c = new Contacts();

		String n = "";
		String k = "AddressBook1";
		multipleAddressBook.put(k, c);
		int counter = sc.nextInt();
		while (counter != 1) {
			System.out.println(
					"Enter your choice\n1.add contact\n2.edit contact\n3.Display AddressBook\n4.Delete contact\n5.Create another address book\n6.exit");
			int choice = sc.nextInt();
			if (choice == 5) {
				System.out.println("Enter the name of the addressbook");
				n = sc.next();
				Contacts c1 = new Contacts();
				multipleAddressBook.put(n, c1);

			} else if (choice == 6)
				counter = 1;
			else {
				System.out.println("Enter the addressbook where you want to insert or modify the  contact!!");
				n = sc.next();
				choice(choice, multipleAddressBook.get(n));
			}

		}
	}

	/*
	 * method to perform various opertaion based on choice
	 */
	public static void choice(int choice, Contacts c) {

		switch (choice) {
		case 1:
			addContact(c);
			break;
		case 2:
			editContact(c);
			break;
		case 3:
			displayContact(c);
			break;
		case 4:
			deleteContact(c);
			break;

		}
	}

	/*
	 * method to delete contact from addressBook
	 */
	private static void deleteContact(Contacts c) {
		System.out.println("enter the first name");
		sc.nextLine();
		String firstName = sc.nextLine();
		System.out.println("enter the last name");
		String lastName = sc.nextLine();
		Contacts person = getPerson(firstName, lastName, c);
		c.contactList.remove(person);

	}

	/*
	 * method to display contacts in addressBook
	 */
	private static void displayContact(Contacts c) {
		for (Contacts contact : c.contactList) {
			contact.display();

		}

	}

	/*
	 * method to add contact into addressBook
	 */
	public static void addContact(Contacts c) {
		System.out.println("enter the first name");
		sc.nextLine();
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
		Contacts c1 = new Contacts(firstName, lastName, address, city, state, zip, phoneNumber, email);
		c.contactList.add(c1);

	}

	/*
	 * method to get contact
	 */
	public static Contacts getPerson(String firstName, String lastName, Contacts c) {
		for (Contacts contact : c.contactList) {
			if (contact.firstName.equals(firstName) && contact.lastName.equals(lastName)) {
				return contact;
			}

		}
		return null;

	}

	/*
	 * method to modify contact
	 */
	public static void editContact(Contacts c) {

		System.out.println("enter the first name");
		sc.nextLine();
		String firstName = sc.nextLine();
		System.out.println("enter the last name");
		String lastName = sc.nextLine();
		System.out.println("hi");
		Contacts person = getPerson(firstName, lastName, c);

		int choice = 0;
		while (choice != 9) {
			System.out.println(
					"1 First Name\n2 Last Name\n3 Address\n4 City\n5 State\n6Zip\n7 Phone number\n8Email\n9 Exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("enter the first name");
				sc.nextLine();
				String fname = sc.nextLine();
				person.firstName = fname;
				break;
			case 2:
				System.out.println("enter the last name");
				sc.nextLine();
				String lname = sc.nextLine();
				person.lastName = lname;
				break;
			case 3:
				System.out.println("enter the address");
				sc.nextLine();
				String address = sc.nextLine();
				person.address = address;
				break;
			case 4:
				System.out.println("enter the city");
				sc.nextLine();
				String city = sc.nextLine();
				person.city = city;
				break;
			case 5:
				System.out.println("enter state");
				sc.nextLine();
				String state = sc.nextLine();
				person.state = state;
				break;
			case 6:
				System.out.println("enter the zip code");
				sc.nextLine();
				String zip = sc.nextLine();
				person.zip = zip;
				break;
			case 7:
				System.out.println("enter phone number");
				sc.nextLine();
				String phone = sc.nextLine();
				person.phoneNumber = phone;
				break;
			case 8:
				System.out.println("enter email");
				sc.nextLine();
				String email = sc.nextLine();
				person.email = email;
				break;
			}
		}
	}

}
