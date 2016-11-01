package assignement.fowler.refactoring.preservewholeobject;

class Room {
	private TempRange _daysTempRange;

	public Room(TempRange tempRange) {
		_daysTempRange = tempRange;
	}

	boolean withinPlan(HeatingPlan plan) {
		return plan.withinRange(daysTempRange());
	}

	private TempRange daysTempRange() {
		return _daysTempRange;
	}
}
