package assignement.fowler.refactoring.movemethod;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {
	
	@Test
	public void testOverdraftChargePremium() throws Exception {
		Account account = new Account(new Premium(), 23);
		assertEquals("23.6", String.valueOf(account.overdraftCharge()));
	}
	
	@Test
	public void testOverdraftChargeStandard() throws Exception {
		Account account = new Account(new Standard(), 23);
		assertEquals("40.25", String.valueOf(account.overdraftCharge()));
	}

}
