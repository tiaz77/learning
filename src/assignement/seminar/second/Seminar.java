package assignement.seminar.second;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Seminar {

	private String[] _course;
	private String _location;
	private List<String[]> _enrollments = new ArrayList<String[]>();
	private int _seats;
	private SeminarPrinter _seminarPrinter;
	
	public Seminar(SeminarPrinter seminarPrinter) {
		_seminarPrinter = seminarPrinter;
		_course = new String[] {"Math", "2", "Math Level 1"};
		_location = "Mendrisio";
		_seats = 20;
		addEnrollment(new String[]{"Mattia", "Cattaneo", "12.02.2015"});
		addEnrollment(new String[]{"Enrico", "Mazzi", "14.02.2015"});
	}
	
	private void addEnrollment(String[] values) {
		if (_seats - _enrollments.size() > 0) {
			_enrollments.add(values);
		}
	}

	private String getName() {
		return _course[0] + " " + _course[1];
	}

	private List<String[]> getStudentList() {
		List<String[]> result = new ArrayList<>();
		for (String[] enrollment : _enrollments) {
			result.add(enrollment);
		}
		return result;
	}
	
	public int getSeatsLeft() {
		return _seats - _enrollments.size();
	}

	public void render() {
		Map<String,List<String[]>> values = new HashMap<String,List<String[]>>();
		
		values.put("seminar",  addValue(getName()));
		values.put("course",  addValue(_course[0]));
		values.put("number",  addValue(_course[1]));
		values.put("description",  addValue(_course[2]));
		values.put("location",  addValue(_location));
		values.put("seatsLeft",  addValue(String.valueOf(getSeatsLeft())));
		
		List<String[]> students = new ArrayList<String[]>();
		for (String[] student : getStudentList()) {
			students.add(student);
		}
		values.put("student", students);
		
		_seminarPrinter.render(values);
	}
	
	private List<String[]> addValue(String value) {
		List<String[]> result = new ArrayList<String[]>();
		result.add(new String[] { value });
		return result;
	}


}
