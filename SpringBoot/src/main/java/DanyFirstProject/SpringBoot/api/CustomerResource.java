package DanyFirstProject.SpringBoot.api;

import DanyFirstProject.SpringBoot.model.Customer;
import DanyFirstProject.SpringBoot.model.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerResource {
    @Autowired
    private CustomerService customerService;
    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer){
        return customerService.addCustomer(customer);
    }

    @GetMapping
   public List<Customer> getCustomers(){
        return customerService.getCustomers();
    }

    @GetMapping(value="/{customerId}")
    public Customer getCustomer(@PathVariable("customerId")int customerId){
        return customerService.getCustomer(customerId);
    }

    @PostMapping(value="/{customerId}")
    public Customer updateCustomer(@PathVariable("customerId") int customerId, @RequestBody Customer customer){
     return  customerService.updateCustomer(customerId,customer);
    }

    @DeleteMapping
    public void deleteCustomer(@PathVariable("customerId") int customerId){
        customerService.deleteCustomer(customerId);

    }
}
