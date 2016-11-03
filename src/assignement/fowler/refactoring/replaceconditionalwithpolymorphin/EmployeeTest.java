package assignement.fowler.refactoring.replaceconditionalwithpolymorphin;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {

	@Test
	public void testEngineer() {
		Employee employee = new Employee(5000,200,300, new Engineer());
		assertEquals(5000, employee.payAmount());
 	}

	@Test
	public void testSalesman() {
		Employee employee = new Employee(5000,200,300, new Salesman());
		assertEquals(5200, employee.payAmount());
 	}

	@Test
	public void testManager() {
		Employee employee = new Employee(5000,200,300, new Manager());
		assertEquals(5300, employee.payAmount());
 	}
}
