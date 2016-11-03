package assignement.fowler.refactoring.replaceconditionalwithpolymorphin;

public class Salesman extends EmployeeType {

	@Override
	int getTypeCode() {
		return Employee.SALESMAN;
	}

}
