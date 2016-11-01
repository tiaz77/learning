package assignement.fowler.refactoring.inlineclass;

public class Person {
	public Person(String name) {
		_name = name;
	}

	public String getName() {
		return _name;
	}

	public String getTelephoneNumber() {
		return _officeTelephone.getTelephoneNumber();
	}

	TelephoneNumber getOfficeTelephone() {
		return _officeTelephone;
	}

	private String _name;
	private TelephoneNumber _officeTelephone = new TelephoneNumber();

}
