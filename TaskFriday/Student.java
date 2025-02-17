package com.TaskSaturday;

import java.util.Objects;

public class Student {
	private String firstname;
    private String lastname;
    private int age;
    private Address address;
	public Student(String firstname, String lastname, int age, Address address) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.address = address;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}public String getFullName() {
        return firstname + " " + lastname;
    }

	@Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return getFullName().equals(student.getFullName()) &&
                address.equals(student.address);
    }
	@Override
    public int hashCode() {
        return Objects.hash(getFullName(), address);
    }

    @Override
    public String toString() {
        return getFullName() + ", Age: " + age + ", Address: " + address;
    }

}
