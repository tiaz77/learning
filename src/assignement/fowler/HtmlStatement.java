package assignement.fowler;

public class HtmlStatement extends Statement {

	public String footerString(Customer customer) {
		return "<P>You owe <EM>" + String.valueOf(customer.getTotalCharge()) + "</EM><P>\n" 
				+ "On this rental you earned <EM>" + String.valueOf(customer.getTotalFrequentRenterPoints())
				+ "</EM> frequent renter points<P>";
	}

	public String eachRentalString(Rental each) {
		return each.getMovie().getTitle() + ": " + String.valueOf(each.getCharge()) + "<BR>\n";
	}

	public String headerString(Customer customer) {
		String result = "<H1>Rentals for <EM>" + customer.getName() + "</EM></H1><P>\n";
		return result;
	}

}
