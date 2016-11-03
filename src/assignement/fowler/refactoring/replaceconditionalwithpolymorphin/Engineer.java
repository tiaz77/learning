package assignement.fowler.refactoring.replaceconditionalwithpolymorphin;

public class Engineer extends EmployeeType {

	@Override
	int payAmount(Employee employee) {
		return employee.getMonthlySalary();
	}

}
