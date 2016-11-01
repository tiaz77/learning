package assignement.fowler.refactoring.inlineclass;

import static org.junit.Assert.*;

import org.junit.Test;

public class TelephoneNumberTest {

	@Test
	public void test() {
		Person person = new Person("Mattia", "091", "5589269");
		assertEquals("(091) 5589269", person.getTelephoneNumber());
	}

}
