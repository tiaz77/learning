package assignement.fowler.refactoring.replaceconditionalwithpolymorphin;

public class Employee {

	static final int ENGINEER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;
	
	private int _monthlySalary;
	private int _commission;
	private int _bonus;
	private EmployeeType _type;

	public Employee(int monthlySalary, int commssion, int bonus, EmployeeType type) {
		_monthlySalary = monthlySalary;
		_commission = commssion;
		_bonus = bonus;
		_type = type;
	}

	int payAmount() {
		switch (getType()) {
		case Employee.ENGINEER:
			return _monthlySalary;
		case Employee.SALESMAN:
			return _monthlySalary + _commission;
		case Employee.MANAGER:
			return _monthlySalary + _bonus;
		default:
			throw new RuntimeException("Incorrect Employee");
		}
	}

	private int getType() {
		return _type.getTypeCode();
	}
}