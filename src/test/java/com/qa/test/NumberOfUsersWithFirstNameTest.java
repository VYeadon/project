package com.qa.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.other.Feature;
import com.qa.other.Service;

public class NumberOfUsersWithFirstNameTest {

	@Test
	public void testEquals() {
		Service serviceObj = new Service();
		serviceObj.setPerson("mical", "person");
		serviceObj.setPerson("mical", "Otherperson");
		
		Feature featureObj = new Feature(serviceObj.getPersonListMap());
		
		assertEquals(2,featureObj.numberOfUsersWithFirstName("mical"));
	}
	
	@Test
	public void testEquals1() {
		Service serviceObj = new Service();
		serviceObj.setPerson("mical", "person");
		serviceObj.setPerson("steve", "Otherperson");
		serviceObj.setPerson("mical", "steven");
		serviceObj.setPerson("mical", "benson");
		
		Feature featureObj = new Feature(serviceObj.getPersonListMap());
		
		assertEquals(3,featureObj.numberOfUsersWithFirstName("mical"));
	}
	
	@Test
	public void test3() {
		Service serviceObj = new Service();
		serviceObj.setPerson("mical", "person");
		serviceObj.setPerson("mical", "Otherperson");
		serviceObj.setPerson("benjiman", "steve");
		
		Feature featureObj = new Feature(serviceObj.getPersonListMap());
		
		assertEquals(0,featureObj.numberOfUsersWithFirstName("steve"));
	}
	
	@Test
	public void test4() {
		Service serviceObj = new Service();
		serviceObj.setPerson("mical", "person");
		serviceObj.setPerson("ben", "person");
		
		Feature featureObj = new Feature(serviceObj.getPersonListMap());
		
		assertEquals(0,featureObj.numberOfUsersWithFirstName("person"));
	}

	
	
}
