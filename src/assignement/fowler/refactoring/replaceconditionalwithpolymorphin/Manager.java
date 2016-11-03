package assignement.fowler.refactoring.replaceconditionalwithpolymorphin;

public class Manager extends EmployeeType {

	@Override
	int getTypeCode() {
		return Employee.MANAGER;
	}

}
