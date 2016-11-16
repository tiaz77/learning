package assignement.fowler.refactoring.hidedelegate;

public class Department {
	private String _chargeCode;
	private Person _manager;

	public Department(Person manager) {
		_manager = manager;
	}

	public Person getManager() {
		return _manager;
	}
	
	public void setChargeCode(String chargeCode) {
		_chargeCode = chargeCode;
	}
}
