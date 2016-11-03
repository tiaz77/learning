package assignement.fowler.refactoring.replaceconditionalwithpolymorphin;

public class Salesman extends EmployeeType {

	@Override
	int payAmount(Employee employee) {
		return employee.getMonthlySalary() + employee.getCommission();
	}

}
