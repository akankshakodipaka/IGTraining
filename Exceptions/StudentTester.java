package com.Exceptions;

public class StudentTester {
	public static void main(String[] args)
	{
		String code="1101";
		try {
			String name=getStudentName(code);
			System.out.println(name);
		}
		catch(AdmissionCodeException e)
		{
			System.out.println(e);
		}
	}
	private static String getStudentName(String code)throws AdmissionCodeException{
		StudentManager manager=new StudentManager();
		return manager.getStudentName(code);
	}

}
