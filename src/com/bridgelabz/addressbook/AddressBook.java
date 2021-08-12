package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

import com.bridgelabz.addressbook.dto.Person;

public class AddressBook {

	static final Scanner SC = new Scanner(System.in);
	ArrayList<Person> personList = new ArrayList<>();

	public static void main(String[] args) {
		System.out.println("...........Welcome to Address Book Management System Development......");
		AddressBook addressBook = new AddressBook();
		addressBook.addContact();
	}

	public void addContact() {
		Person person = new Person();
		System.out.print("Enter First Name : ");
		person.setFirstName(SC.next());
		System.out.print("Enter Last Name : ");
		person.setLastName(SC.next());
		System.out.print("Address : ");
		person.setAddress(SC.next());
		System.out.print("City : ");
		person.setCity(SC.next());
		System.out.print("State : ");
		person.setState(SC.next());
		System.out.print("Zip : ");
		person.setZip(SC.next());
		System.out.print("Phone Number : ");
		person.setPhoneNumber(SC.next());
		System.out.print("Email I'd : ");
		person.setEmail(SC.next());
		personList.add(person);
		System.out.print(personList);
		performAgain();
	}
	
	public void performAgain() {
			System.out.println("\n Do you want to perform again");
			System.out.println("Choose  Y or N ");
			char choice = SC.next().charAt(0);
			if (choice == 'Y' || choice == 'y') {
				addContact();
			}
	}
}
