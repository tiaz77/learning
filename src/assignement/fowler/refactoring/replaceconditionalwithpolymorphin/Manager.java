package assignement.fowler.refactoring.replaceconditionalwithpolymorphin;

public class Manager extends EmployeeType {

	@Override
	int payAmount(Employee employee) {
		return employee.getMonthlySalary() + employee.getBonus();
	}

}
