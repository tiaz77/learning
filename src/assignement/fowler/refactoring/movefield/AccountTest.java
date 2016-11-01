package assignement.fowler.refactoring.movefield;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {

	@Test
	public void testInterest() {
		double result = new Account(new AccountType(12.7)).interestForAmount_days(1590.32,18);
		assertEquals("996.0195945205479", String.valueOf(result));
	}

}
