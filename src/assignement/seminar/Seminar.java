package assignement.seminar;

import java.util.ArrayList;
import java.util.List;

public class Seminar {

	private Course _course;
	private String _location;
	private List<Enrollment> _enrollments = new ArrayList<Enrollment>();
	private int _seats;
	
	public Seminar() {
		_course = new Course("Math", 2, "Math Level 1");
		_location = "Mendrisio";
		_seats = 20;
		addEnrollment((new Enrollment(new Student("Mattia", "Cattaneo"), "12.02.2015")));
		addEnrollment((new Enrollment(new Student("Enrico", "Mazzi"), "14.02.2015")));
	}
	
	private void addEnrollment(Enrollment enrollment) {
		if (getSeatsLeft() > 0) {
			_enrollments.add(enrollment);
		}
	}

	public String getName() {
		return _course.getName() + " " + _course.getNumber();
	}

	public String getDescription() {
		return _course.getDescription();
	}

	public String getLocation() {
		return _location;
	}

	public int getSeatsLeft() {
		return _seats - _enrollments.size();
	}

	public List<List<String>> getStudentList() {
		List<List<String>> result = new ArrayList<>();
		for (Enrollment enrollment : _enrollments) {
			result.add(enrollment.getInfo());
		}
		return result;
	}

}
