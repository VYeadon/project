package com.qa.other;

import java.util.HashMap;

public class Feature {
	
	private HashMap<Integer, Account> personList;
	
	public Feature(HashMap<Integer, Account> listOfPersons)
	{
		personList = listOfPersons;
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
