package assignement.fowler.refactoring.replaceinheritancewithdelegation;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyStackTest {

	@Test
	public void testPush() {
		MyStack stack = new MyStack();
		stack.push("1");
		assertEquals("1", stack.pop());
		assertEquals(0, stack.size());
		assertEquals(true, stack.isEmpty());
	}

}
