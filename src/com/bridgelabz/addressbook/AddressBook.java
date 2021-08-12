package com.bridgelabz.addressbook;

import java.util.ArrayList;

import com.bridgelabz.addressbook.dto.Person;

public class AddressBook {
	public static void main(String[] args) {
		System.out.println("...........Welcome to Address Book Management System Development......");
		ArrayList<Person> personList = new ArrayList<>();
		Person person = new Person();
		personList.add(person);
		System.out.println(personList);
	}

}
