package com.Exceptions;

public class StudentService {
	public String getStudentName(String admissionCode)throws AdmissionCodeException{
		String [][] names= {{"1101","Ravi kumar"},{"1102","Lakshmi"},{"1103","Madhavi"}};
		for(int i=0;i<names.length;i++)
		{
			if(names[i][0].equals(admissionCode))
			{
				return names[i][1];
			}
		}
	
	String error=admissionCode+"\n No Such admission code in our records";
	throw new AdmissionCodeException(error);
	}
}
