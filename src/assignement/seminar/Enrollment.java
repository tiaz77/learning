package assignement.seminar;

import java.util.ArrayList;
import java.util.List;

public class Enrollment {

	private Student _student;

	public List<String> getInfo() {
		List<String> result = new ArrayList<String>();
		result.add(_student.getName());
		return result;
	}

}
