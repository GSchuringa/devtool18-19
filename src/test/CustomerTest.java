import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    @Test
    public void equals() {
        Customer cust1 = new Customer("Kris");
        Customer cust2 = new Customer("Kris");
        Customer copyCust1 = cust1;
        assertTrue(cust1.equals(cust2));
        assertTrue(cust1.equals(copyCust1));
    }

    @Test
    public void getName() {
    }

    @Test
    public void getId() {
    }

}