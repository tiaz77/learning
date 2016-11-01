package assignement.fowler.refactoring.introduceparameterobject;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

class Account {

	double getFlowBetween(DateRange period) {
		double result = 0;
		Enumeration e = _entries.elements();
		while (e.hasMoreElements()) {
			Entry each = (Entry) e.nextElement();
			if (period.contains(each.getDate()))
				result += each.getValue();
		}
		return result;
	}

	private Vector _entries = new Vector();

	public void addEntry(Entry entry) {
		_entries.add(entry);
	}
	
	

}