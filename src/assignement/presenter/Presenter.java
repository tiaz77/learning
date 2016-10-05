package assignement.presenter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Presenter {

	private List<Student> _students;


	public static void main(String[] args) throws FileNotFoundException {
		File file;
		if (args.length == 0) {
			System.out.println("a default student list csv has been created");
			file = new File("student.csv");
			PrintWriter writer = new PrintWriter(file);
			writer.println("Student,20.09.2015");
			writer.println("Mattia,true");
			writer.println("Dario,false");
			writer.println("Enri,true");
			writer.println("Chicco,false");
			writer.close();
		} else {
			file = new File(args[0]);
		}
		
		System.out.println(file.getAbsolutePath());
		
		List<Student> students = new ArrayList<Student>();
		
		Scanner scanner = new Scanner(file);
		if (scanner.hasNextLine()) scanner.nextLine();
		while (scanner.hasNextLine()) {
			students.add(new Student(scanner.nextLine().split(",")[0],Boolean.valueOf(scanner.nextLine().split(",")[1])));
		}
		scanner.close();
		
		System.out.println(new Presenter(students).choose());
		
	}
	
	
	public String choose() {
		List<String> candidates = new ArrayList<String>();
		for (Student student : _students) {
			if (student.isReady()) {
				candidates.add(student.getName());
			}
		}
		return new Chooser(candidates).choose();
	}


	public Presenter(List<Student> students){
		_students = students;
	}


}
