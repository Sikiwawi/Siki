package DanyFirstProject.SpringBoot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Customer {
    @JsonProperty("id")
    private int customerId;
    private String customerFirstName;
    private String customerLastName;
    private String customerEmail;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerFirstname() {
        return customerFirstName;
    }

    public void setCustomerFirstname(String customerFirstname) {
        this.customerFirstName = customerFirstname;
    }


    public String getCustomerLastname() {
        return customerLastName;
    }

    public void setCustomerLastname(String customerLastname) {
        this.customerLastName = customerLastname;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
}
