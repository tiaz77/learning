package assignement.presenter;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class PresenterTest {

	@Test
	public void testMattiaIsReady() {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Mattia", true));
		assertEquals("Mattia", new Presenter(students).choose());
	}

	@Test
	public void testNobodyIsReady() {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Mattia", false));
		assertEquals(null, new Presenter(students).choose());
	}

}
