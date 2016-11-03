package assignement.fowler.refactoring.introducenullobject;

public class CustomerInformation {

	private Site _site;
	private Customer _customer;

	public CustomerInformation(Site site) {
		_site = site;
		_customer = site.getCustomer();
	}

	public BillingPlan getBillingPlan() {
		return _customer.getPlan();
	}

	public String getCustomerName() {
		return _customer.getName();
	}

	public int getWeeksDelinquent() {
		return _customer.getHistory().getWeeksDelinquentInLastYear();
	}

}
