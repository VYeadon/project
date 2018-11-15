package com.qa.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.other.Service;

public class NumberOfUsersWithFirstNameTest {

	@Test
	public void testEquals() {
		Service serviceObj = new Service();
		serviceObj.setPerson("mical", "person");
		serviceObj.setPerson("mical", "Otherperson");
		
		assertEquals(2,serviceObj.numberOfUsersWithFirstName("mical"));
	}
	
	@Test
	public void testEquals1() {
		Service serviceObj = new Service();
		serviceObj.setPerson("mical", "person");
		serviceObj.setPerson("steve", "Otherperson");
		serviceObj.setPerson("mical", "steven");
		serviceObj.setPerson("mical", "benson");
				
		assertEquals(3,serviceObj.numberOfUsersWithFirstName("mical"));
	}
	
	@Test
	public void test3() {
		Service serviceObj = new Service();
		serviceObj.setPerson("mical", "person");
		serviceObj.setPerson("mical", "Otherperson");
		serviceObj.setPerson("benjiman", "steve");
				
		assertEquals(0,serviceObj.numberOfUsersWithFirstName("steve"));
	}
	
	@Test
	public void test4() {
		Service serviceObj = new Service();
		serviceObj.setPerson("mical", "person");
		serviceObj.setPerson("ben", "person");
				
		assertEquals(0,serviceObj.numberOfUsersWithFirstName("person"));
	}
	
	@Test
	public void test5() {
		Service serviceObj = new Service();
		serviceObj.setPerson("mical", "person");
		serviceObj.setPerson("ben", "person");
		
		assertEquals(2,serviceObj.getPersonListMap().size());
		
		serviceObj.setPerson("steve", "perfssson");
		
		assertEquals(3,serviceObj.getPersonListMap().size());
		
		serviceObj.getPersonListMap().remove(1);
		
		assertEquals(2,serviceObj.getPersonListMap().size());
	}
	
	
}
