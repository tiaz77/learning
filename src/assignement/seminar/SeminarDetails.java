package assignement.seminar;

public class SeminarDetails {

	private Seminar _seminar;

	public void render() {
		System.out.println(_seminar.getName());
		System.out.println(_seminar.getDescription());
		System.out.println(_seminar.getLocation());
		System.out.println(_seminar.getSeatsLeft());
		System.out.println(_seminar.getStudentList());
		
	}


}
