package assignement.fowler.refactoring.encapsulatecollection;

public class Course {

	private boolean _isAdvanced;
	private String _name;

	public Course(String name, boolean isAdvanced) {
		_name = name;
		_isAdvanced = isAdvanced;
	}
	
	public boolean isAdvanced() {
		return _isAdvanced;
	}

}
