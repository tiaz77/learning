package assignement.fowler.refactoring.replaceparameterwithexplicitmethods;

public class Employee {

	static Employee createManager() {
		return new Manager();
	}

	static Employee createSalesman() {
		return new Salesman();
	}

	 static Employee createEngineer() {
		return new Engineer();
	}
}
