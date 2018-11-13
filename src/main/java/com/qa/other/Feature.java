package com.qa.other;

import java.util.HashMap;

public class Feature {
	
	private HashMap<Integer, Account> personList;
	
	public Feature(HashMap<Integer, Account> listOfPersons)
	{
		personList = listOfPersons;
	}
	
	
	public int numberOfUsersWithFirstName(String name) {
		
		int count = 0;
		
		for(int i=1; i <= personList.size() ; i++)
		{
			if(personList.get(i).getFirstName() == name)
			{
				count++;
			}
		}
		
		return count;
		
	}

}
