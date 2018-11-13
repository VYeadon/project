package com.qa.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.other.Service;

public class NumberOfUsersWithFirstNameTest {

	@Test
	public void test() {
		Service serviceObj = new Service();
		
		serviceObj.setPerson("mical", "person");
		serviceObj.setPerson("mical", "Otherperson");
		
		assertEquals(2,serviceObj.numberOfUsersWithFirstName("mical"));
	}

}
