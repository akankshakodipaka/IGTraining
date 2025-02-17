package com.Exceptions;
public class CredentialException extends Exception {
	private String name;
	public CredentialException() {
		
	}
	public CredentialException(String name)
	{
		this.name=name;
	}
	@Override
	public String getMessage() {
		return "Invalid Credentials";
	}
	public String toString() {
		return "Userid:"+this.name+"is invalid";
	}

}
