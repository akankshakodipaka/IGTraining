package com.Exceptions;

import java.util.Scanner;

public class AverageCalculator {

	
	public static double calAverage(int n)throws IllegalArgumentException
	{
		if(n<=0)
		{
			throw new IllegalArgumentException("Input should be a Natural Number");
		}
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		return (double)(sum/n);
	}
	public static void main(String args[])throws IllegalArgumentException
	
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(calAverage(n));
		
		
	}

}
