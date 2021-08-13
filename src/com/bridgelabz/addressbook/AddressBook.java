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
		addressBook.performOperations();
	}

	public void performOperations() {
		System.out.println("Enter Option \n1.AddContact\n2.EditContact");
		int option = SC.nextInt();
		switch (option) {
		case 1:
			addContact();
			break;
		case 2:
			editContact();
			break;
		default:
			System.out.println("You have Enter Invalid Option");
		}
		performAgain();
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

	public void editContact() {
		System.out.println("Enter first name to edit the contact");
		String firstName = SC.next();
		for (int i = 0; i < personList.size(); i++) {
			if (personList.get(i).getFirstName().equals(firstName)) {
				System.out.println(
						"Choose which you want to edit\n1.First Name\n2.Last Name\n3.Address\n4.City\n5.State\n6.Zip\n7.Phone Number\n8.Email I'd");
				int choice = SC.nextInt();
				switch (choice) {
				case 1:
					System.out.println("New First Name : ");
					personList.get(i).setFirstName(SC.next());
					break;
				case 2:
					System.out.println("New Last Name : ");
					personList.get(i).setLastName(SC.next());
					break;
				case 3:
					System.out.println("New Address : ");
					personList.get(i).setLastName(SC.next());
					break;
				case 4:
					System.out.println("New City : ");
					personList.get(i).setLastName(SC.next());
					break;
				case 5:
					System.out.println("New State : ");
					personList.get(i).setLastName(SC.next());
					break;
				case 6:
					System.out.println("New Zip : ");
					personList.get(i).setLastName(SC.next());
					break;
				case 7:
					System.out.println("New Phone Number : ");
					personList.get(i).setLastName(SC.next());
					break;
				case 8:
					System.out.println("New Email I'd : ");
					personList.get(i).setLastName(SC.next());
					break;
				default:
					System.out.println("Enter a valid number");
				}
			}
		}
		System.out.println(personList);
	}

	public void performAgain() {
		System.out.println("\nDo you want to perform again");
		System.out.println("Choose  Y or N ");
		char choice = SC.next().charAt(0);
		if (choice == 'Y' || choice == 'y') {
			performOperations();
		}
	}
}
