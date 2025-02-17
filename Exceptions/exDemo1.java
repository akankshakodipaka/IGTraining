package com.Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class exDemo1 {
	public static void disp()throws FileNotFoundException
	{
		FileReader f=new FileReader("c://abc.txt");
		System.out.println("Method");
	}
	
	public static void main (String[] args)throws FileNotFoundException
	{
		int a=10;
		int b=2;
		//try {
		int c=a/b;
		System.out.println(c);
		//}
//		catch(ArithmeticException e)
//		{
//			System.out.println(e);
//		}
		disp();
		System.out.println("Thank you");
	}
}
