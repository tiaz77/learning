package assignement.fowler.refactoring.introduceparameterobject;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class AccountTest extends Account {

	@Test
	public void test() throws ParseException {
		Account anAccount = new Account();
		anAccount.addEntry(new Entry(9,getDate("09.03.2016")));
		anAccount.addEntry(new Entry(10,getDate("10.03.2016")));
		anAccount.addEntry(new Entry(11,getDate("17.03.2016")));
		anAccount.addEntry(new Entry(12,getDate("18.03.2016")));
		
		assertTrue(21d == anAccount.getFlowBetween(new DateRange(getDate("10.03.2016"), getDate("17.03.2016"))));
		
	}

	private Date getDate(String date) throws ParseException {
		return new SimpleDateFormat("dd.mm.yyyy").parse(date);
	}

}
