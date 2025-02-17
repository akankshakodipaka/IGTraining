package com.Exceptions;

import java.util.Date;

public class ContactClass {
	String firstName;
	String middleName;
	String lastName;
	Date DateOfBirth;
	String gender;
	String phoneNumber;
	

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		phoneNumber = phoneNumber;
	}

	public ContactClass(String firstName, String middleName, String lastName, Date dateOfBirth,String gender,String phoneNumber) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.DateOfBirth = dateOfBirth;
		this.gender=gender;
		this.phoneNumber=phoneNumber;
		}
	//@Override
//	public String toString() {
//		String dob = new java.text.SimpleDateFormat("dd-MM-yyyy").format(dateOfBirth);
//		return "Name:"+firstName+middleName+lastName+" Date Of Birth: "+dob+" Gender: "+gender+" Phone Number: "+phoneNumber;
//	}
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	
	
	

}
