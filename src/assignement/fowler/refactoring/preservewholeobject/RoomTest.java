package assignement.fowler.refactoring.preservewholeobject;

import static org.junit.Assert.*;

import org.junit.Test;

public class RoomTest  {

	@Test
	public void test() {
		HeatingPlan plan = new HeatingPlan(new TempRange(10,20));
		assertFalse(new Room(new TempRange(12,22)).withinPlan(plan));
	}

}
