package assignement.fowler.refactoring.replaceparameterwithexplicitmethods;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {

	@Test
	public void testEngineer() {
		assertEquals(Engineer.class.getName(),  Employee.create(Employee.ENGINEER).getClass().getName());
	}

	@Test
	public void testManager() {
		assertEquals(Manager.class.getName(),  Employee.create(Employee.MANAGER).getClass().getName());
	}

	@Test
	public void testSalesman() {
		assertEquals(Salesman.class.getName(),  Employee.create(Employee.SALESMAN).getClass().getName());
	}

}
