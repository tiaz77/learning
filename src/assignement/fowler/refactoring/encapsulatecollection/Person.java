package assignement.fowler.refactoring.encapsulatecollection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Person {

	private Set<Course> _courses = new HashSet<Course>();

	public Set getCourses() {
		return Collections.unmodifiableSet(_courses);
	}

	public void add(Course course) {
		_courses.add(course);
	}

	public void remove(Course refact) {
		//come gestire l'eventaule errore? (silente? eccezione?)
		_courses.remove(refact);
	}

}
