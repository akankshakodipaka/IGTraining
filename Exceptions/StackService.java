package com.Exceptions;

import java.util.Calendar;
import java.util.Stack;

public class StackService {
	private int maxSize=6;
	//private int top;
	public StackService() {
		// TODO Auto-generated constructor stub
	}
	Stack<ContactClass> stack=new Stack<>();
	public  void push(ContactClass contactClass)throws StackExceptions 
	{
		if(isFull())
		{
			throw new StackExceptions("Stack is Full");
		}
		String name=contactClass.firstName+contactClass.middleName+contactClass.lastName;
		validation(contactClass,name);
			
		stack.push(contactClass);
	}
	public  boolean isFull()
	{
		return stack.size() == maxSize-1;
	}
	
	public ContactClass pop()throws StackExceptions
	{
		if(stack.isEmpty())
		{
			throw new StackExceptions("Stack is empty");
		}
		return stack.pop();
	}
	public void validation(ContactClass contactClass,String name)throws StackExceptions
	{
		if(name.length()>8)
		{
			throw new StackExceptions("Name should be atleast 8 characters");
			
		}
		Calendar calendar = Calendar.getInstance();
	    calendar.setTime(contactClass.getDateOfBirth());
	    int yearOfBirth = calendar.get(Calendar.YEAR);

	    // Check if the year of birth is greater than 2025
	    if (yearOfBirth > 2025) {
	        throw new StackExceptions("Give the proper date (cannot be in the future)");
	    }
//		if(2025 < contactClass.getDateOfBirth().getYear()) 
//		{
//			throw new StackExceptions("Give the pr0per date ");
//			
//		}

		String g=contactClass.getGender();
		if(!(g.equalsIgnoreCase("Male")||g.equalsIgnoreCase("Female")))
		{
			throw new StackExceptions("Give proper Gender");
			
		}
		if(contactClass.getPhoneNumber().length()!=10)
		{
			throw new  StackExceptions("Give 10 digit PhoneNumber");
			
		}
		
	}
	
	

}
