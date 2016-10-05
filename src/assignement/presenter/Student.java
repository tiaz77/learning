package assignement.presenter;

public class Student {

	private String _name;
	private boolean _ready;

	public Student(String name, boolean ready) {
		_name = name;
		_ready = ready;
	}

	public boolean isReady() {
		return _ready;
	}

	public String getName() {
		return _name;
	}
	
	
	
}