package assignement.fowler.refactoring.introducenullobject;

public class Site {

	private Customer _customer = new NullCustomer();

	public Customer getCustomer() {
		return _customer;
	}

	public void setCustomer(Customer customer) {
		_customer = customer;
		
	}

}
