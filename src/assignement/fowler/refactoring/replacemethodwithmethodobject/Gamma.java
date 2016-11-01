package assignement.fowler.refactoring.replacemethodwithmethodobject;

public class Gamma {
	
	final Account _account;
	private int _inputVal = 0;
	private int _quantity = 0;
	private int _yearToDate = 0;
	
	Gamma(Account account, int inputVal, int quantity, int yearToDate) {
		_account = account;
		_inputVal = inputVal;
		_quantity = quantity;
		_yearToDate = yearToDate;
	}
	
	int compute() {
		int importantValue1 = (_inputVal * _quantity) + _account.delta();
		int importantValue2 = (_inputVal * _yearToDate) + 100;
		if ((_yearToDate - importantValue1) > 100)
			importantValue2 -= 20;
		int importantValue3 = importantValue2 * 7;
		// and so on.
		return importantValue3 - 2 * importantValue1;
		
	}

}
