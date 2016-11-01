package assignement.fowler.refactoring.movemethod;

public class Account {

	private AccountType _type;
	private int _daysOverdrawn;

	public Account(AccountType accountType, int daysOverdrawn) {
		_type = accountType;
		_daysOverdrawn = daysOverdrawn;
	}

	double overdraftCharge() {
		return _type.overDraftCharge(_daysOverdrawn);
	}

	double bankCharge() {
		double result = 4.5;
		if (_daysOverdrawn > 0)
			result += overdraftCharge();
		return result;
	}

}
