package assignement.fowler.refactoring.encapsulatecollection;

import java.util.Set;

public class Person {

	private Set _courses;

	public void setCourses(Set courses) {
		_courses = courses;
	}

	public Set getCourses() {
		return _courses;
	}

}
