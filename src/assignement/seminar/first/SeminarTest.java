package assignement.seminar.first;

import static org.junit.Assert.*;

import org.junit.Test;

public class SeminarTest {

	@Test
	public void test() {
		Seminar seminar = new Seminar();
		String result = seminar.render();
		System.out.println(result);
		assertEquals("Seminar: Math 2\nDescription: Math Level 1\nLocation: Mendrisio\nSeats left: 18\nStundent: Mattia Cattaneo 12.02.2015\nStundent: Enrico Mazzi 14.02.2015\n", result);
	}
	
	@Test
	public void testHtml() {
		Seminar seminar = new Seminar();
		String result = seminar.render();
		System.out.println(result);
		assertEquals("Seminar: Math 2\nDescription: Math Level 1\nLocation: Mendrisio\nSeats left: 18\nStundent: Mattia Cattaneo 12.02.2015\nStundent: Enrico Mazzi 14.02.2015\n", result);
	}	

}
