package assignement.fowler.refactoring.extractsubclass;

public class Labor extends JobItem {

	private Employee _employee;

	public Labor(int unitPrice, int quantity, Employee employee) {
		super(unitPrice, quantity);
		_employee = employee;
	}
	
	@Override
	public int getUnitPrice() {
		return _employee.getRate();
	}
	
	public Employee getEmployee() {
		return _employee;
	}
	
	


}
