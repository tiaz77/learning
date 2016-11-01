package assignement.fowler.refactoring.introducenullobject;

public class CustomerInformation {

	private Site _site;
	private Customer _customer;

	public CustomerInformation(Site site) {
		_site = site;
		_customer = site.getCustomer();
	}

	public BillingPlan getBillingPlan() {
		BillingPlan plan;
		if (_customer == null)
			plan = BillingPlan.basic();
		else
			plan = _customer.getPlan();
		return plan;
	}

	public String getCustomerName() {
		String customerName;
		if (_customer == null)
			customerName = "occupant";
		else
			customerName = _customer.getName();
		return customerName;
	}

	public int getWeeksDelinquent() {

		int weeksDelinquent;
		if (_customer == null)
			weeksDelinquent = 0;
		else
			weeksDelinquent = _customer.getHistory().getWeeksDelinquentInLastYear();

		return weeksDelinquent;
	}

}
