package assignement.fowler;

import java.util.Enumeration;

public abstract class Statement {

	public String value(Customer customer) {
		
		Enumeration rentals = customer.getRentals().elements();
		String result = headerString(customer);
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			// show figures
			result += eachRentalString(each);
		}
		// add footer lines
		result += footerString(customer);
		return result;
	}


	abstract String headerString(Customer customer);
	abstract String eachRentalString(Rental each);
	abstract String footerString(Customer customer);


}
