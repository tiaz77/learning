package assignement.seminar;

public class Student {

	private String _lastname;
	private String _firstname;

	public Student(String lastname, String firstname) {
		_firstname = lastname;
		_lastname = firstname;
	}

	public String getName() {
		return getFullName();
	}

	private String getFullName() {
		return _firstname + " " + _lastname;
	}

}
