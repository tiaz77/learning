package assignement.fowler.refactoring.replaceparameterwithexplicitmethods;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {

	@Test
	public void testEngineer() {
		assertEquals(Engineer.class.getName(),  Employee.createEngineer().getClass().getName());
	}

	@Test
	public void testManager() {
		assertEquals(Manager.class.getName(),  Employee.createManager().getClass().getName());
	}

	@Test
	public void testSalesman() {
		assertEquals(Salesman.class.getName(),  Employee.createSalesman().getClass().getName());
	}

}
