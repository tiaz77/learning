package assignement.fowler.refactoring.introduceparameterobject;

import java.util.Date;

public class DateRange {

	private Date _start;
	private Date _end;

	public DateRange(Date start, Date end) {
		_start = start;
		_end = end;
	}

	public boolean contains(Date date) {
		return date.equals(_start) || date.equals(_end)
				|| (date.after(_start) && date.before(_end));		
	}

}
