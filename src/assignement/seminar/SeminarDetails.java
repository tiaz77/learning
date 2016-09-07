package assignement.seminar;

import java.util.Iterator;
import java.util.List;

public class SeminarDetails {

	private Seminar _seminar = new Seminar();

	public String render() {
		String result = "";
		result += "Seminar: " + _seminar.getName() + "\n";
		result += "Description: " + _seminar.getDescription() + "\n";
		result += "Location: " + _seminar.getLocation() + "\n";
		result += "Seats left: " + _seminar.getSeatsLeft() + "\n";
		for (List<String> student : _seminar.getStudentList()) {
			result += "Stundent: ";
			for (Iterator<String> iterator = student.iterator(); iterator.hasNext();) {
				result += iterator.next();
				if (iterator.hasNext()) {
					result += " ";
				}
			}
			result += "\n";
		}
		return result;
	}


}
