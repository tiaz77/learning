package assignement.fowler.refactoring.changebidirectionalassociation;

public class Order {
	private int _price;

	Customer getCustomer() {
		return _customer;
	}

	void setCustomer(Customer arg) {
		if (_customer != null)
			_customer.friendOrders().remove(this);
		_customer = arg;
		if (_customer != null)
			_customer.friendOrders().add(this);
	}

	
	double getDiscountedPrice() {
		return getGrossPrice() * (1 - _customer.getDiscount());
	}
		
	private int getGrossPrice() {
		return _price;
	}
	
	void setPrice(int price) {
		_price = price;
		
	}

	private Customer _customer;
}
