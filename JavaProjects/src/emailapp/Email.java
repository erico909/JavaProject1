package emailapp;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int defaultPasswordLength = 10;
	private int mailboxCapacity = 100;
	private String email;
	private String altEmail;
	private String companySuffix = "westeros.com";
	 
	
	
	//Constructor receiving first and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
	//Method call asking user for department
		this.department = getDepartment();
		
	//Method call returning a password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("\nYour password is: " + this.password);
		
	//Combine variables to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase()+ "@" + department + "." + companySuffix;
		
		
	}
	
	
	
	//Method asking user for department - return string
	private String getDepartment() {
		System.out.print("\nDEPARTMENT CODES\n1: Sales\n2: Development\n3: Accounting\n0: None\nEnter Department Code:");
		Scanner sc = new Scanner(System.in);
		int deptChoice = sc.nextInt();
		String input = "";
		switch(deptChoice) {
			
		case 1: if (deptChoice == 1) input = "Sales";
		case 2: if (deptChoice == 2) input = "Development";
		case 3: if (deptChoice == 3) input = "Accounting";
		case 0: if (deptChoice == 0) input = "";
		
		}
		return input;
	}
	
	//Method generating random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for (int i = 0; i<length; i++) {
		int rand = (int)(Math.random() * passwordSet.length());
		password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	//Set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
		System.out.println("Your mailbox Capacity has changed!");
	}
	
	//Set the alternate email
	public void setAlternateEmail(String alt) {
		this.altEmail = alt;
		System.out.println("You've made an alternate email!");
		
	}
	//Change the password
	public void changePassword(String password) {
		this.password = password;
		System.out.println("You have changed your password!");
	}
	
	//Get first and last name
	public String getName() {
		return this.firstName + this.lastName;
	}
	
	//Get email
	public String getEmail() {
		return this.email;
	}
	
	//Get mailbox capacity
	public int getMailboxCap() {
		return this.mailboxCapacity;
	}
	
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName + 
				"\nCompany Email: " + email + 
				"\nDepartment: " + department +
				"\nMailbox Capacity: " + mailboxCapacity;
	}

}
