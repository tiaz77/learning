package assignement.fowler;

public class Movie {
	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	private String _title;
	private Price _priceCode;

	public Movie(String title, int priceCode) {
		_title = title;
		setPriceCode(priceCode);
	}

	public int getPriceCode() {
		return _priceCode.getPriceCode();
	}

	private void setPriceCode(int priceCode) {
		switch(priceCode) {
		case Movie.REGULAR:
			_priceCode = new RegularPrice();
			break;
		case Movie.NEW_RELEASE:
			_priceCode = new NewReleasePrice();
			break;
		case Movie.CHILDRENS:
			_priceCode = new ChildrensPrice();
			break;
		default: throw new IllegalArgumentException("invalid price code");
		}
	}

	public String getTitle() {
		return _title;
	}

	public double getCharge(int daysRented) {
		return _priceCode.getCharge(daysRented);
	}

	public int getFrequentRenterPoints(int daysRented) {
		return _priceCode.getFrequentRenterPoints(daysRented);
	};
}
