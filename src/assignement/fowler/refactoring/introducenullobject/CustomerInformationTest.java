package assignement.fowler.refactoring.introducenullobject;

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerInformationTest {

	@Test
	public void testNoCustomer() {
		Site site = new Site();
		CustomerInformation customerInformation = new CustomerInformation(site);
		assertEquals(BillingPlan.basic(), customerInformation.getBillingPlan());
		assertEquals("occupant", customerInformation.getCustomerName());
		assertEquals(0, customerInformation.getWeeksDelinquent());
	}
	
	@Test
	public void testWithCustomer() {
		Customer customer = new Customer(new BillingPlan("custom"), "Mattia Cattaneo");
		customer.getHistory().setWeeksDelinquentInLastYear(3);
		Site site = new Site();
		site.setCustomer(customer);
		CustomerInformation customerInformation = new CustomerInformation(site);
		assertEquals(new BillingPlan("custom"), customerInformation.getBillingPlan());
		assertEquals("Mattia Cattaneo", customerInformation.getCustomerName());
		assertEquals(3, customerInformation.getWeeksDelinquent());
	}

}
