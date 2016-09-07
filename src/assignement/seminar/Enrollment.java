package assignement.seminar;

import java.util.ArrayList;
import java.util.List;

public class Enrollment {

	private Student _student;
	private String _registratinoDate;

	public Enrollment(Student student, String registrationDate) {
		_student = student;
		_registratinoDate = registrationDate;
	}

	public List<String> getInfo() {
		List<String> result = new ArrayList<String>();
		result.add(_student.getName());
		result.add(_registratinoDate);
		return result;
	}

}
