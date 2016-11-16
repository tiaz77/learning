package assignement.fowler.refactoring.changebidirectionalassociation;

import java.util.HashSet;
import java.util.Set;

public class Customer {
	void addOrder(Order arg) {
		arg.setCustomer(this);
	}

	private Set _orders = new HashSet();

	Set friendOrders() {
		/** should only be used by Order */
		return _orders;
	}

	public double getDiscount() {
		return 0.2;
	}
}