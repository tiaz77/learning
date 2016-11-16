package assignement.fowler.refactoring.changebidirectionalassociation;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrderTest {

	@Test
	public void test() {
		Order order = new Order();
		order.setPrice(11);
		Customer customer = new Customer();
		order.setCustomer(customer);
		customer.addOrder(order);
		
		assertEquals("8.8", String.valueOf(order.getDiscountedPrice()));
	}

}
