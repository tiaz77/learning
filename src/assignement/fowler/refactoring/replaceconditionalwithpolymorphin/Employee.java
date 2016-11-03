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
		return _type.payAmount(this);
	}

	public int getMonthlySalary() {
		return _monthlySalary;
	}

	public int getBonus() {
		return _bonus;
	}

	public int getCommission() {
		return _commission;
	}

}