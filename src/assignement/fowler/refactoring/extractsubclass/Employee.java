package assignement.fowler.refactoring.extractsubclass;

class Employee {
	public Employee(int rate) {
		_rate = rate;
	}

	public int getRate() {
		return _rate;
	}

	private int _rate;
}