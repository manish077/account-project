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
		Account account2 = new Account("Manish", "Seth", 2);
		Account account3 = new Account("Abz", "Shell", 4);
		Account account4 = new Account("Alan", "Sugar", 5);
		
		
	}

	@Test
	public void test() {
		Service thisService = new Service();
		Account account1 = new Account("Manish", "Seth", 2);
		Account account2 = new Account("Manish", "Seth", 2);
		Account account3 = new Account("Abz", "Shell", 4);
		Account account4 = new Account("Alan", "Sugar", 5);
        assertEquals(2,thisService.countName("Manish"));
	}
	
	@After
	public void teardown() {
		
	}

}
