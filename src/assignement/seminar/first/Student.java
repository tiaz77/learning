package assignement.seminar.first;

public class Student {

	private String _lastname;
	private String _firstname;

	public String getName() {
		return getFullName();
	}

	private String getFullName() {
		return _firstname + _lastname;
	}

}
