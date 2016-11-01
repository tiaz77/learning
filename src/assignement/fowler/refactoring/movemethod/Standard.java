package assignement.fowler.refactoring.movemethod;

public class Standard implements AccountType {


	@Override
	public double overDraftCharge(int daysOverdrawn) {
		return daysOverdrawn * 1.75;
	}

}
