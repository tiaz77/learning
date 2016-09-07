package assignement.fowler;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StatementTest {
	
	private Customer _customer;

	@Before
	public void setup() {
		_customer = new Customer("Mattia");
	}
	
	@Test
	public void noRent() {
		String[] statementLines = _customer.statement().split("\n");
		
		assertEquals("Rental Record for Mattia", statementLines[0]);
		assertEquals("Amount owed is 0.0", statementLines[1]);
		assertEquals("You earned 0 frequent renter points", statementLines[2]);
	}

	@Test
	public void testExtraChargeAfter2DaysOnRegularMovie() {
		_customer.addRental(new Rental(new Movie("test1", Movie.REGULAR),3));
		String[] statementLines = _customer.statement().split("\n");
		
		assertEquals("Rental Record for Mattia", statementLines[0]);
		assertEquals("\ttest1\t3.5", statementLines[1]);
		assertEquals("Amount owed is 3.5", statementLines[2]);
		assertEquals("You earned 1 frequent renter points", statementLines[3]);
	}
	
	@Test
	public void testFlatChargeOfANewReleaseMovie() {
		_customer.addRental(new Rental(new Movie("test1", Movie.NEW_RELEASE),10));
		String[] statementLines = _customer.statement().split("\n");
		
		assertEquals("Rental Record for Mattia", statementLines[0]);
		assertEquals("\ttest1\t30.0", statementLines[1]);
		assertEquals("Amount owed is 30.0", statementLines[2]);
		assertEquals("You earned 2 frequent renter points", statementLines[3]);
	}
	
	@Test
	public void testExtraChargeAfter3DaysOnChildrensMovie() {
		_customer.addRental(new Rental(new Movie("test1", Movie.CHILDRENS),4));
		String[] statementLines = _customer.statement().split("\n");
		
		assertEquals("Rental Record for Mattia", statementLines[0]);
		assertEquals("\ttest1\t3.0", statementLines[1]);
		assertEquals("Amount owed is 3.0", statementLines[2]);
		assertEquals("You earned 1 frequent renter points", statementLines[3]);
	}	

	@Test
	public void rentOfMultipleTypeOfMovies() {
		_customer.addRental(new Rental(new Movie("test1", Movie.CHILDRENS),1));
		_customer.addRental(new Rental(new Movie("test2", Movie.REGULAR),1));
		String[] statementLines = _customer.statement().split("\n");
		
		assertEquals("Rental Record for Mattia", statementLines[0]);
		assertEquals("\ttest1\t1.5", statementLines[1]);
		assertEquals("\ttest2\t2.0", statementLines[2]);
		assertEquals("Amount owed is 3.5", statementLines[3]);
		assertEquals("You earned 2 frequent renter points", statementLines[4]);
	}		
	

}
