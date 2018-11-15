package com.qa.other;

import java.util.HashMap;

public class Service {
	
	private int accountNumber = 1;
	
	private HashMap<Integer, Account> personList = new HashMap<Integer, Account>();
	
	public HashMap<Integer, Account> getPersonListMap()
	{
		return personList;
	}
	
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
		if(personList.size()<accountNumber)
		{
			System.out.println("no account found with this account number");
			return;
		}
		
		Account user = personList.get(accountNumber);
		
		System.out.println("The users first name is: " + user.getFirstName());
		System.out.println("The users last name is: " + user.getLastName());
		System.out.println("The users account number is: " + accountNumber);
	}
	
	public Account getPersonAccountObject(int accountNumber)
	{
		if(!personList.containsKey(accountNumber))
		{
			System.out.println("no account found with this account number");
			return null;
		}
		
		return personList.get(accountNumber);
	}
	
	public int numberOfUsersWithFirstName(String name) {
		
		return
		(int) personList.entrySet()
						.stream()
						.filter( account -> 
									account.getValue().getFirstName().equalsIgnoreCase(name))
						.count();
	}

}
