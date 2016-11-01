package assignement.fowler.refactoring.extractsubclass;

class JobItem {
	public JobItem(int unitPrice, int quantity) {
		_unitPrice = unitPrice;
		_quantity = quantity;
	}

	public int getTotalPrice() {
		return getUnitPrice() * _quantity;
	}

	public int getUnitPrice() {
		return  _unitPrice  ;
	}

	public int getQuantity() {
		return _quantity;
	}



	private int _unitPrice;
	private int _quantity;
}