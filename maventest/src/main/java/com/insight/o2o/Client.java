package com.insight.o2o;

import com.maven.maventest.JPAUtil;

import jakarta.persistence.EntityManager;
public class Client {
	public static void main(String[] args) {
	    EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		Student student = new Student();
		student.setName("Akanksha");
		Address homeAddress = new Address();
		homeAddress.setStreet("Nizampet");
		homeAddress.setCity("Hyderabad");
		homeAddress.setState("Telangana");
		homeAddress.setZipCode("506076");
		//inject address into student
		student.setAddress(homeAddress);
		
		//persist only student, no need to persist Address explicitly
		em.persist(student);
		em.getTransaction().commit();
		
		System.out.println("Added one student with address to database.");
		em.close();
		
	}
}