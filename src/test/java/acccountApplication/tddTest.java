package acccountApplication;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import application.Account;
import application.Service;

public class tddTest {

	@Before
	public void setup() {
		Service thisService = new Service();
		Account account1 = new Account("Manish", "Seth", 2);

	}

	@Test
	public void testByCount() {
		Service thisService = new Service();
		Account account1 = new Account("Manish", "Seth", 2);
		Account account2 = new Account("Manish", "Man", 1);
		
		thisService.add_user(account1);
		thisService.add_user(account2);
		assertEquals(2, thisService.countName("Manish"));

	}
	
	@Test
	public void testByStream() {
		Service thisService = new Service();
		Account account1 = new Account("Manish", "Seth", 2);
		Account account2 = new Account("Manish", "man", 1);
		
		thisService.add_user(account1);
		thisService.add_user(account2);
		assertEquals(2, thisService.countNameByStream("Manish"));
	}
	

	@After
	public void teardown() {

	}

}
