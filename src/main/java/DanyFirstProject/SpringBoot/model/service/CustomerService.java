package DanyFirstProject.SpringBoot.model.service;

import DanyFirstProject.SpringBoot.model.Customer;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
@Component
public class CustomerService {
    private int customerIdCount;
    private List<Customer> customerList = new CopyOnWriteArrayList<>();

    public CustomerService(){
        customerIdCount = 1;
    }

    public Customer addCustomer(Customer customer){
        customer.setCustomerId(customerIdCount);
        customerList.add(customer);
        customerIdCount++;
        return customer;

    }

    public List<Customer> getCustomers(){
        return customerList;

    }
    public Customer getCustomer(int customerId){
        return customerList
                .stream()
                .filter(c -> c.getCustomerId() == customerId)
                .findFirst()
                .get();


    }
   public Customer updateCustomer(int customerId ,Customer customer){
            customerList
                    .stream()
                    .forEach(c->{
                        if(c.getCustomerId()== customerId){
                            c.setCustomerFirstname(customer.getCustomerFirstname());
                            c.setCustomerLastname(customer.getCustomerLastname());
                            c.setCustomerEmail(customer.getCustomerEmail());
                        }
                    });
            return customerList
                    .stream()
                    .filter(c->c.getCustomerId()==customerId)
                    .findFirst()
                    .get();
    }
    public void deleteCustomer(int customerId){
        customerList
                .stream()
                .forEach(c->{
                    if(c.getCustomerId()==customerId){
                        customerList.remove(c);
                    }
                });
    }
}
