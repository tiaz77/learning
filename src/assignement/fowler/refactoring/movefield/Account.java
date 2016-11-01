package assignement.fowler.refactoring.movefield;

public class Account {
	private AccountType _type;

	public Account(AccountType type) {
		_type = type;
	}

	double interestForAmount_days(double amount, int days) {
		return _type.getInterestRate() * amount * days / 365;
	}

}
