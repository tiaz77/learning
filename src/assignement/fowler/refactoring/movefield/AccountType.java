package assignement.fowler.refactoring.movefield;

public class AccountType {
	
	private double _interestRate;

	public AccountType(double interestRate) {
		_interestRate = interestRate;
	}

	double getInterestRate() {
		return _interestRate;
	}

}
