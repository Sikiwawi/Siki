package DanyFirstProject.SpringBoot.model.service;

import DanyFirstProject.SpringBoot.api.dao.CustomerDAO;
import DanyFirstProject.SpringBoot.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public class CustomerService {
    @Autowired
    private CustomerDAO customerDAO;

    public Customer addCustomer(Customer customer){
        return customerDAO.save(customer);
    }

    public List<Customer> getCustomers(){
        return customerDAO.findAll();
    }

    public Customer getCustomer(int customerId){

//        return customerDAO.findById(customerId);
     return customerDAO.findById(customerId).get();
    }
   public Customer updateCustomer(Customer customer){
//            customerDAO.save(customer);
//            return customer;
       return null;
    }
    public void deleteCustomer(int customerId){
        customerDAO.deleteById(customerId);
        }

        }



