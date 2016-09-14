package assignement.seminar.third;

public class PlainSeminarPrinter extends SeminarPrinter {


	@Override
	public String print(Seminar seminar) {
		String result = "";
		result += "Seminar: "+  seminar.getCourse() +  " " + seminar.getNumber() + "\n";
		result += "Description: " + seminar.getCourseDescription() + "\n";
		result += "Location: " + seminar.getLocation() + "\n";
		result += "Seats left: " + seminar.getSeatsLeft() + "\n";
		return result;
		
	}

	@Override
	public String print(Student student) {
		return "Stundent: " + student.getFirstname() + " " + student.getName() + "\n";
	}

	@Override
	public String printHeader() {
		return "";
	}

	@Override
	public String printFooter() {
		return "";
	}


}
