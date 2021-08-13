package com.bridgelabz.addressbook;
import java.util.ArrayList;
import java.util.Scanner;
import com.bridgelabz.addressbook.dto.Person;

public class AddressBook {

	public static void main(String[] args) {
		System.out.println("...........Welcome to Address Book Management System Development......");

		MultipleContact contact = new MultipleContact();
		contact.performOperations();
	}
}
