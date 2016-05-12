package org.pgs.java;

public class MailIdValidation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MailIdValidation id= new MailIdValidation();

	}

	public void validate(String name, String email) {
		// TODO Auto-generated method stub
		if(name.equals("Sakthi"))
		{
			System.out.println("Name is correct");
		}
		else
		{
			System.out.println("Incorrect name");
		}
		if(email.indexOf('@')>1)
		{
			System.out.println("Valid Email ID");
		}
		else
		{
			System.out.println("Sorry Invalid Email ID");
		}
		
	}

}
