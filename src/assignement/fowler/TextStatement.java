package assignement.fowler;

public class TextStatement extends Statement {

	public String footerString(Customer customer) {
		return "Amount owed is " + String.valueOf(customer.getTotalCharge()) + "\n" +
			"You earned " + String.valueOf(customer.getTotalFrequentRenterPoints()) + " frequent renter points";
	}

	String eachRentalString(Rental each) {
		return "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
	}

	String headerString(Customer customer) {
		String result = "Rental Record for " + customer.getName() + "\n";
		return result;
	}

}
