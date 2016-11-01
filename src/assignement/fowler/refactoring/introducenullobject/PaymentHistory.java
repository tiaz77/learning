package assignement.fowler.refactoring.introducenullobject;

public class PaymentHistory {

	private int _weeks;

	public int getWeeksDelinquentInLastYear() {
		return _weeks;
	}

	public void setWeeksDelinquentInLastYear(int week) {
		_weeks = week;
	}

}
