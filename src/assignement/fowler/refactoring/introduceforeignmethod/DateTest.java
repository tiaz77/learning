package assignement.fowler.refactoring.introduceforeignmethod;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class DateTest {
	
	@Test
	public void test() throws Exception {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
		Date previousEnd = dateFormat.parse("31.12.2016");
		Date newStart = new Date (previousEnd.getYear(), previousEnd.getMonth(), previousEnd.getDate() + 1);
		
		assertEquals("01.01.2017", dateFormat.format(newStart));
	}

}
