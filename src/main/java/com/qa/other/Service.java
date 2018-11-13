package com.qa.other;

import java.util.HashMap;

public class Service {
	
	private static int accountNumber = 1;
	
	private HashMap<Integer, Account> personList = new HashMap<Integer, Account>();
	
	public void setPerson(String firstName, String lastName)
	{
		Account user = new Account();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setAccountNumber(accountNumber);
		
		personList.put(accountNumber, user);
		
		accountNumber++;
	}
	
	public void getPerson(int accountNumber)
	{
		Account user = personList.get(accountNumber);
		
		System.out.println("The users first name is: " + user.getFirstName());
		System.out.println("The users last name is: " + user.getLastName());
		System.out.println("The users account number is: " + accountNumber);
	}
	
	public Account getPersonAccountObject(int accountNumber)
	{
		return personList.get(accountNumber);
	}

}
