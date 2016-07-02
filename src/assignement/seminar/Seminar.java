package assignement.seminar;

import java.util.ArrayList;
import java.util.List;

public class Seminar {

	private Course _course;
	private String _location;
	private List<Enrollment> _enrollments;

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
		//seats - number of student?
		return 2;
	}

	public List<List<String>> getStudentList() {
		List<List<String>> result = new ArrayList<>();
		for (Enrollment enrollment : _enrollments) {
			result.add(enrollment.getInfo());
		}
		return result;
	}

}
