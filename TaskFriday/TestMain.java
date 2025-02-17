package com.TaskSaturday;

import java.util.HashSet;

public class TestMain {
	public static void main(String args[])
	{
		Address address1=new Address("Hanamkonda","Warangal","Telangana","506009");
		Address address2=new Address("Ghanpur","Mulugu","Telangana","506321");
		Student student1=new Student("Akanksha","Kodipaka",21,address1);
		Student student2=new Student("Ajay","Kodipaka",17,address2);
		Student student3=new Student("Mahitha","Erri",20,address2);
		Student student4=new Student("Akanksha","Kodipaka",20,address1);
		HashSet<Student> students=new HashSet<>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		for(Student student:students)
		{
			System.out.println(student);
		}
		
	}

}
