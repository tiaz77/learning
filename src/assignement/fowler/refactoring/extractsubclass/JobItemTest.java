package assignement.fowler.refactoring.extractsubclass;

import static org.junit.Assert.*;

import org.junit.Test;

public class JobItemTest {

	@Test
	public void testLabor() {
		Employee mattia = new Employee(2);
		assertEquals(20, new Labor(12,10,mattia).getTotalPrice());
 	}
	@Test
	public void test() {
		Employee mattia = new Employee(2);
		assertEquals(120, new JobItem(12,10).getTotalPrice());
	}

}
