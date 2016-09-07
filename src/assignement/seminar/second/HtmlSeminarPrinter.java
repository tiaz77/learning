package assignement.seminar.second;

import java.util.List;
import java.util.Map;

public class HtmlSeminarPrinter implements SeminarPrinter {

	private String _result;

	@Override
	public void render(Map<String, List<String[]>> values) {
		_result = "<html>\n";
		_result += "<head>\n\t<title>" + values.get("course").get(0)[0] + "</title>\n</head>\n";
		_result += "<body>\n";
		_result += "\t<div>" + values.get("seminar").get(0)[0] + ":</div>\n";
		_result += "\t<ul>\n";
		_result += "\t\t<li>" + values.get("description").get(0)[0] + "</li>\n";
		_result += "\t\t<li>" + values.get("location").get(0)[0] + "</li>";
		_result += "\t\t<li>" + values.get("seatsLeft").get(0)[0] + "</li>";
		_result += "\t</ul>\n";
		_result += "<div>partecipanti:</div>\n";
		_result += "\t<ul>\n";
		for (String[] student : values.get("student")) {
			_result += "\t\t<li>" + student[0] + " " + student[1] + "</li>\n";
		}
		_result += "\t</ul>\n";
		_result +=  "\t</body>\n";
		_result +=  "</html>";
		
	}
	
	public String result() {
		return _result;
	}

}
