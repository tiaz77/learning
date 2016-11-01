package assignement.fowler.refactoring.inlineclass;

public class Person {
	private String _areaCode;
	private String _number;
	private String _name;
	
	public Person(String name) {
		_name = name;
	}
	
	void setAreaCode(String areaCode) {
		_areaCode = areaCode;
	}
	
	void setNumber(String number) {
		_number = number;
	}

	public String getName() {
		return _name;
	}

	public String getTelephoneNumber() {
		return ("(" + _areaCode + ") " + _number);
	}

}
