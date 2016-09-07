package assignement.seminar;

public class Course {

	private String _name;
	private int _number;
	private String _description;

	public Course(String name, int number, String description) {
		_name = name;
		_number = number;
		_description = description;
	}

	public String getName() {
		return _name;
	}

	public int getNumber() {
		return _number;
	}

	public String getDescription() {
		return _description;
	}

}
