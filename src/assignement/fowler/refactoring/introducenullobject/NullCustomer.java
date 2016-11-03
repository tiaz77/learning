package assignement.fowler.refactoring.introducenullobject;

public class NullCustomer extends Customer {

	private PaymentHistory _paymentHistory = new PaymentHistory();
	private BillingPlan _plan = BillingPlan.basic();

	public NullCustomer() {
		super(BillingPlan.basic(), "occupant");
	}
	
	@Override
	public boolean isNull() {
		return true;
	}
	

}
