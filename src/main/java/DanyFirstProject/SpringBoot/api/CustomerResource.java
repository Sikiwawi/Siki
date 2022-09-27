package DanyFirstProject.SpringBoot.api;

import DanyFirstProject.SpringBoot.model.Customer;
import DanyFirstProject.SpringBoot.model.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
   public Iterable<Customer> getCustomers(){
        return customerService.getCustomers();
    }

    @GetMapping(value="/{customerId}")
    public Customer getCustomer(@PathVariable("customerId")int customerId){
        return customerService.getCustomer(customerId);
    }

    @PostMapping(value="/{customerId}")
    public Customer updateCustomer(@PathVariable("customerId") int customerId, @RequestBody Customer customer){
     return  customerService.updateCustomer(customer);
    }

    @DeleteMapping
    public void deleteCustomer(@PathVariable("customerId") int customerId){
        customerService.deleteCustomer(customerId);

    }
}
