package assignement.fowler.refactoring.inlineclass;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	@Test
	public void test() {
		Person person = new Person("Mattia");
		person.getOfficeTelephone().setAreaCode("091");
		person.getOfficeTelephone().setNumber("5589269");
		assertEquals("(091) 5589269", person.getTelephoneNumber());
	}
	
	

}
