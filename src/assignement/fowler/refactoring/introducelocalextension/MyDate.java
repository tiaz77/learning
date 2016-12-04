package assignement.fowler.refactoring.introducelocalextension;

import java.util.Date;

public class MyDate extends Date {

	public MyDate(Date aDate) {
		super(aDate.getTime());
	}

	public Date nextDay() {
		return new Date (getYear(), getMonth(), getDate() + 1);
	}

}
