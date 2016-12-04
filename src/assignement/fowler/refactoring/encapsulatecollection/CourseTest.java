package assignement.fowler.refactoring.encapsulatecollection;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;

public class CourseTest {

	@Test
	public void test() throws Exception {
		Person kent = new Person();
		kent.add(new Course("Smalltalk Programming", false));
		kent.add(new Course("Appreciating Single Malts", true));
		
		assertEquals(2, kent.getCourses().size());
		Course refact = new Course("Refactoring", true);
		kent.add(refact);
		kent.add(new Course("Brutal Sarcasm", false));
		assertEquals(4, kent.getCourses().size());
		kent.remove(refact);
		assertEquals(3, kent.getCourses().size());
	}

	@Test
	public void testAdvanceCourses() {
		Person kent = new Person();
		kent.add(new Course("Smalltalk Programming", false));
		kent.add(new Course("Appreciating Single Malts", true));
		Iterator iter = kent.getCourses().iterator();
		int count = 0;
		while (iter.hasNext()) {
			Course each = (Course) iter.next();
			if (each.isAdvanced())
				count++;
		}
		assertEquals(1, count);

	}

}
