package assignement.fowler.refactoring.replacedelegationwithinheritance;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	@Test
	public void test() {
		Person person = new Person();
		person.setName("Mattia Cattaneo");
		assertEquals("Cattaneo", person.toString());
	}

}
