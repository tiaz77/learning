package assignement.fowler.refactoring.inlineclass;

public class Person {
	public Person(String name, String areaCode, String number) {
		_name = name;
		_officeTelephone.setAreaCode(areaCode);
		_officeTelephone.setNumber(number);
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
