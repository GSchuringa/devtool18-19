import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {
    private static CustomerRepository instance = null;
    List<Customer> customerList;

    private CustomerRepository(){
        customerList = new ArrayList<>();

    }
    public static CustomerRepository getInstance(){
        if(instance == null){
            instance = new CustomerRepository();
        }
        return instance;
    }

    public boolean addCustomer(Customer cust){
        for (Customer customer: customerList) {
            if(customer.equals(cust)){
                return false;
            }
        }
        customerList.add(cust);
        return true;
    }

    public void printCustomers(){
        for (Customer customer: customerList) {
            System.out.println(customer.toString());
        }
    }
}
