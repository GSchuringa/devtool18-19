import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerRepositoryTest {

    @Test
    public void addCustomer() {
        Customer cust1 = new Customer("Kris");
        Customer cust2 = new Customer("Gerton");
        Customer cust3 = new Customer("Kris");

        boolean addCust1 = CustomerRepository.getInstance().addCustomer(cust1);
        boolean addCust2 = CustomerRepository.getInstance().addCustomer(cust2);
        boolean addCust3 = CustomerRepository.getInstance().addCustomer(cust3);
        assertTrue( "Trying to add customer", addCust1);
        assertTrue( "Trying to add customer", addCust2);
        assertFalse( "Trying to add duplicate", addCust3);
    }

    @Test
    public void printCustomers() {
    }
}