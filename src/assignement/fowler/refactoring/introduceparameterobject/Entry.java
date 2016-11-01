package assignement.fowler.refactoring.introduceparameterobject;

import java.util.Date;

class Entry {
	Entry(double value, Date chargeDate) {
		_value = value;
		_chargeDate = chargeDate;
	}

	Date getDate() {
		return _chargeDate;
	}

	double getValue() {
		return _value;
	}

	private Date _chargeDate;
	private double _value;
}