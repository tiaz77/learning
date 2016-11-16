package assignement.fowler.refactoring.replacedelegationwithinheritance;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {

	@Test
	public void test() {
		Employee employee = new Employee();
		employee.setName("Giorgia Cattaneo");
		assertEquals("Emp: Cattaneo", employee.toString());
	}

}
