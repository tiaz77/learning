package assignement.seminar.second;

import java.util.List;
import java.util.Map;

public class PlainSeminarPrinter implements SeminarPrinter {

	private String _result;

	@Override
	public void render(Map<String, List<String[]>> values) {
		_result = "";
		_result += "Seminar: " + values.get("seminar").get(0)[0] + "\n";
		_result += "Description: " + values.get("description").get(0)[0] + "\n";
		_result += "Location: " + values.get("location").get(0)[0] + "\n";
		_result += "Seats left: " + values.get("seatsLeft").get(0)[0] + "\n";
		for (String[] student : values.get("student")) {
			_result += "Stundent: " + student[0] + " " + student[1] + " " + student[2] + "\n";
		}
	}
	
	public String getResult() {
		return _result;
	}


}
