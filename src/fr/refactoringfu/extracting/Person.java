package fr.refactoringfu.extracting;

import java.util.Date;

// REFACTO: 19. Extract class (cursor anywhere in the class)

public class Person {

	private String name;
	private String surname;
	private String identityCardRef;
	private Date dob;
	private String address;
	private String email;
	private Date lastLogin;
	
	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getIdentityCardRef() {
		return identityCardRef;
	}

	public Date getDob() {
		return dob;
	}

	public String getAddress() {
		return address;
	}

	public String getEmail() {
		return email;
	}

	public Date getLastLogin() {
		return lastLogin;
	}
}
