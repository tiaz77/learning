package assignement.seminar.second;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

public class CsvSeminarPrinter implements SeminarPrinter {
	
	private File _output;


	@Override
	public void render(Map<String, List<String[]>> values) {
		PrintWriter writer;
			try {
				_output = new File(values.get("course").get(0)[0] + ".csv");
				writer = new PrintWriter(_output);
			} catch (FileNotFoundException e) {
				throw new RuntimeException(e);
			}
		
		writer.print("\"");
		writer.print(values.get("number").get(0)[0]);
		writer.print("\";\"");
		writer.print(values.get("course").get(0)[0]);
		writer.print("\";\"");
		writer.print(values.get("description").get(0)[0]);
		writer.print("\";\"");
		writer.print(values.get("location").get(0)[0]);
		writer.print("\";\"");
		writer.print(values.get("seatsLeft").get(0)[0]);
		writer.print("\"");
		writer.println();
		
		for (String[] student : values.get("student")) {
			writer.print("\"");
			writer.print(student[0]);
			writer.print("\";\"");
			writer.print(student[1]);
			writer.print("\"");
			writer.println();
		}
		
		writer.flush();
		writer.close();
	}
	
	public File result() {
		return _output;
	}

}
