package assignement.fowler.refactoring.preservewholeobject;

class HeatingPlan {
	public HeatingPlan(TempRange tempRange) {
		_range = tempRange;
	}

	boolean withinRange(TempRange aRange) {
		return _range.includes(aRange);
	}

	private TempRange _range;
}
