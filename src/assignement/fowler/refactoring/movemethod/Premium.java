package assignement.fowler.refactoring.movemethod;

public class Premium implements AccountType {



	@Override
	public double overDraftCharge(int daysOverdrawn) {
		double result = 10;
		if (daysOverdrawn > 7)
			result += (daysOverdrawn - 7) * 0.85;
		return result;

	}

}
