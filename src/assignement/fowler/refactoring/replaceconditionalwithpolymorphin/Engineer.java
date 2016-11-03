package assignement.fowler.refactoring.replaceconditionalwithpolymorphin;

public class Engineer extends EmployeeType {

	@Override
	int getTypeCode() {
		return Employee.ENGINEER;
	}

}
