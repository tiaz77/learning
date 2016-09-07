package assignement.seminar.first;

import java.util.ArrayList;
import java.util.List;

public class Seminar {

	private String[] _course;
	private String _location;
	private List<String[]> _enrollments = new ArrayList<String[]>();
	private int _seats;
	
	public Seminar() {
		_course = new String[] {"Math", "2", "Math Level 1"};
		_location = "Mendrisio";
		_seats = 20;
		addEnrollment(new String[]{"Mattia", "Cattaneo", "12.02.2015"});
		addEnrollment(new String[]{"Enrico", "Mazzi", "14.02.2015"});
	}
	
	private void addEnrollment(String[] values) {
		if (getSeatsLeft() > 0) {
			_enrollments.add(values);
		}
	}

	private String getName() {
		return _course[0] + " " + _course[1];
	}

	public int getSeatsLeft() {
		return _seats - _enrollments.size();
	}

	public List<String[]> getStudentList() {
		List<String[]> result = new ArrayList<>();
		for (String[] enrollment : _enrollments) {
			result.add(enrollment);
		}
		return result;
	}

	public String render() {
		String result = "";
		result += "Seminar: " + getName() + "\n";
		result += "Description: " + _course[2] + "\n";
		result += "Location: " + _location + "\n";
		result += "Seats left: " + getSeatsLeft() + "\n";
		for (String[] student : getStudentList()) {
			result += "Stundent: " + student[0] + " " + student[1] + " " + student[2] + "\n";
		}
		return result;
	}

}
