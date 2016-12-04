package assignement.fowler.refactoring.introduceassertion;

public class Employee {
	private static final double NULL_EXPENSE = -1.0;
	private double _expenseLimit = NULL_EXPENSE;
	private Project _primaryProject ;  //null object? = new Project()

	//add a constructor with Project as argument
	
	double getExpenseLimit() {
		//add check _primaryProject != null, return default value?
		return (_expenseLimit != NULL_EXPENSE) ? _expenseLimit : _primaryProject.getMemberExpenseLimit();
	}

	boolean withinLimit(double expenseAmount) {
		return (expenseAmount <= getExpenseLimit());
	}
}
