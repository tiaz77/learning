package assignement.fowler.refactoring.hidedelegate;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	@Test
	public void test() {
		Person manager = new Person();
		Department department = new Department(manager);
		
		Person john = new Person();
		john.setDepartment(department);
		
		assertEquals(manager,john.getDepartment().getManager());
	}

}
