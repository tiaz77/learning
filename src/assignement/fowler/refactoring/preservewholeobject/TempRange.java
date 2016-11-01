package assignement.fowler.refactoring.preservewholeobject;

public class TempRange {

	private int _low;
	private int _high;

	public TempRange(int low, int high) {
		_low = low;
		_high = high;
	}

	public int getLow() {
		return _low;
	}

	public int getHigh() {
		return _high;
	}

	public boolean includes(TempRange aRange) {
		return aRange.getLow() >= getLow() && aRange.getHigh() <= getHigh();
	}

}
