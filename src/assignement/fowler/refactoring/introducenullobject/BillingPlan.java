package assignement.fowler.refactoring.introducenullobject;

public class BillingPlan {

	private String _name;

	public BillingPlan(String name) {
		_name = name;
	}

	public static BillingPlan basic() {
		return new BillingPlan("basic");
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj.getClass().equals(this.getClass())) {
			return _name.equals(((BillingPlan)obj)._name);
		}
		
		return false;
	}
	
	

}
