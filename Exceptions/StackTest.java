package com.Exceptions;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StackTest {

	public static void main(String[] args)throws StackExceptions {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StackService service=new StackService();
		while(true)
		{
			System.out.println("1.Push.\n2.Pop.");
			int x=sc.nextInt();
			//System.out.println("1.Push.\n2.Pop.");
			switch(x)
			{
				case 1:
					System.out.println("Enter number of elements you want to push: ");
					int n=sc.nextInt();
					for(int i=0;i<n;i++)
					{
						System.out.println("Enter FirstName:");
						String fN=sc.nextLine();
						sc.nextLine();
						System.out.println("Enter MiddleName:");
						String mN=sc.nextLine();
						//sc.nextLine();
						System.out.println("Enter LastName:");
						String lN=sc.nextLine();
						//sc.nextLine();
						System.out.println("Enter DateOfBirth:");
						Date dob=null;
						try {
						dob = new SimpleDateFormat("dd-MM-YYYY").parse(sc.nextLine());
						}
						catch (Exception e)
						{
							System.out.println("Invalid date format.");
							
						}
						System.out.println("Enter Gender:");
						String gender=sc.nextLine();
						//sc.nextLine();
						System.out.println("Enter Phone Number:");
						String phone=sc.nextLine();
						ContactClass a=new ContactClass(fN,mN,lN,dob,gender,phone);
						service.push(a);	
					}
					break;
				case 2:
					
					System.out.println("The Poped Element :"+service.pop());
					break;
				
				default:
					System.out.println("Invalid operation");

					
			}
		}
	}

}