package javaGameDemo.entities;

import java.time.LocalDate;

import javaGameDemo.abstracts.Entity;

public class Customer implements Entity {
	
	private int id;
	private String firstName;
	private String lastName;
	private String passWord;
	private LocalDate dateOfBirth;
	private String nationalityId;
	
	public Customer() {
		
	}

	public Customer( String firstName, String lastName, String passWord, LocalDate dateOfBirth,
			String nationalityId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.passWord = passWord;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}

	public int getId() {
		return id;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	

}
