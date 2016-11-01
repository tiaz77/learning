package assignement.fowler.refactoring.introducenullobject;

public class Customer {

	private BillingPlan _billingPlan;
	private String _customerName;
	private PaymentHistory _paymentHistory = new PaymentHistory();

	public Customer(BillingPlan billingPlan, String customerName) {
		_billingPlan = billingPlan;
		_customerName = customerName;
	}

	public String getName() {
		return _customerName;
	}

	public PaymentHistory getHistory() {
		return _paymentHistory;
	}

	public BillingPlan getPlan() {
		return _billingPlan;
	}

}
