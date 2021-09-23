package com.yml.book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class AddressBookMain {

	static Map<String, AddressBook> addressBook = new HashMap<>();
	static Scanner r = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to AddressBook program");

		final int EXIT = 6;

		int choice = 0;

		while (choice != EXIT) {

			System.out.println(
<<<<<<< HEAD
					"Enter your choice\n1.add contact\n2.edit contact\n3.Display AddressBook\n4.Delete contact\n5.Create another address book\n6.search\7.exit");
			int choice = sc.nextInt();
			if (choice == 5) {
				System.out.println("Enter the name of the addressbook");
				n = sc.next();
				Contacts c1 = new Contacts();
				multipleAddressBook.put(n, c1);

			} else if (choice == 6) {
				System.out.println("Enter the city or state");
				String city = sc.next();
				AddressBookMain.search(city, multipleAddressBook);
			} else if (choice == 7) {
				counter = 1;
			} else {
				System.out.println("Enter the addressbook where you want to insert or modify the  contact!!");
				n = sc.next();
				choice(choice, multipleAddressBook.get(n));
			}
=======
					"1 : Add AddressBook\n2 : Add Contact\n3 : Edit Contact\n4 : Delete Contact\n5 : Display Contact\n"
							+ EXIT + " : to exit");
			Scanner r = new Scanner(System.in);
			Scanner sc = new Scanner(System.in);
			choice = r.nextInt();
>>>>>>> uc6

			switch (choice) {
			case 1:
				addAddressBook();
				break;

			case 2:
				addContact();
				break;
			case 3:
				editContact();

				break;
			case 4:
				deleteContact();
				break;
			case 5:
				displayContact();
				break;

			case EXIT:
				System.exit(0);

			}

		}

	}

	/**
	 * method to delete contact
	 */
	private static void deleteContact() {
		System.out.println("Enter the name of address book from which you wanna delete");

		String bookName = r.nextLine();
		AddressBook adBook = addressBook.get(bookName);
		if (adBook != null) {
			addressBook.get(bookName).deleteperson();
			;
		} else {
			System.out.println("Book name not found");
		}

	}

	/*
	 * method to edit contact
	 */
<<<<<<< HEAD
	private static void displayContact(Contacts c) {
		if (c.contactList.size() == 0) {
			System.out.println("addressBook is empty");
		} else {
			for (Contacts contact : c.contactList) {
				contact.display();

			}
=======
	private static void editContact() {
		System.out.println("Enter the name of address book to which you wanna edit");

		// Scanner r =new Scanner(System.in);
		String bookName = r.nextLine();
		AddressBook adBook = addressBook.get(bookName);
		if (adBook != null) {
			addressBook.get(bookName).editPerson();
		} else {
			System.out.println("Book name not found");
>>>>>>> uc6
		}

	}

	/*
	 * method to add addressbook
	 */
<<<<<<< HEAD
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
		for (int j = 0; j < c.contactList.size(); j++) {
			Contacts object = c.contactList.get(j);
			if (object.firstName.equals(firstName) && object.lastName.equals(lastName)) {
				System.out.println("Contact already exists!!Please enter a different contact name");
				return;
			}
		}

		Contacts c1 = new Contacts(firstName, lastName, address, city, state, zip, phoneNumber, email);
		c.contactList.add(c1);
=======
	private static void addAddressBook() {
		System.out.println("Enter the name of new address book");

		String bookName = r.nextLine();

		AddressBook book = addressBook.get(bookName);
		if (book != null) {
			System.out.println("Already has a address book of that name");
		} else {

			AddressBook adBook = new AddressBook(bookName);
			addressBook.put(bookName, adBook);
		}
>>>>>>> uc6

	}

	/*
	 * method to display contact
	 */
	private static void displayContact() {
		System.out.println("Enter the name of address book whose contacts you wanna display");

		String bookName = r.nextLine();
		AddressBook adBook = addressBook.get(bookName);

		if (adBook != null) {
			adBook.print();
		} else {
			System.out.println("Book name not found");
		}

	}

	/*
<<<<<<< HEAD
	 * method to search contact from multiple addressbook
	 */
	public static void search(String place, Hashtable m) {

		Set<String> setOfKeys = m.keySet();

		for (String key : setOfKeys) {
			Contacts object = (Contacts) m.get(key);
			for (int j = 0; j < object.contactList.size(); j++) {
				Contacts c = object.contactList.get(j);
				if (c.city.equals(place) || c.state.equals(place)) {
					System.out.println(c.firstName + " " + c.lastName + " is from " + c.city + " " + c.state);

				}
			}
		}
	}

	/*
	 * method to modify contact
=======
	 * method to add contact
>>>>>>> uc6
	 */
	private static void addContact() {

		System.out.println("Enter the name of Address book to which you wanna a add the contact");
		// Scanner r =new Scanner(System.in);
		String adBook = r.nextLine();
		AddressBook Book = addressBook.get(adBook);
		if (Book == null) {
			System.out.println("No book found");

		} else {
			addressBook.get(adBook).addContact();
		}

	}

}