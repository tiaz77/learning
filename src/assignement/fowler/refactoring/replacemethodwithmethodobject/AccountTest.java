package assignement.fowler.refactoring.replacemethodwithmethodobject;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest  {

	@Test
	public void test() {
		assertEquals(181396,new Account().gamma(13, 100, 2016));
	}

}
