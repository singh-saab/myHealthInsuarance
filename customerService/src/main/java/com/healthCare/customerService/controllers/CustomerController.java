

package com.healthCare.customerService.controllers;

import com.healthCare.customerService.clients.PolicyProxy;

import com.healthCare.customerService.entities.Customer;
import com.healthCare.customerService.entities.Policy;
import com.healthCare.customerService.repo.CustomerRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @Autowired
    public CustomerRepo customerRepo;
    @Autowired
    private PolicyProxy policyProxy;

    public CustomerController() {
    }

    @GetMapping({"/customers"})
    public List<Customer> getAllCustomers() {
        return this.customerRepo.findAll();
    }

    @GetMapping({"/customers/{id}"})
    public Customer getCustomerById(Long id) {
        return (Customer)this.customerRepo.findById(id).get();
    }

    @PostMapping({"/customers"})
    public Customer createCustomer(Customer Customer) {
        return (Customer)this.customerRepo.save(Customer);
    }

    @GetMapping({"/policies/{customerId}"})
    public List<Policy> getAllPoliciesByCustomerId(@PathVariable Long customerId) {
        return this.policyProxy.getAllPoliciesByCustomerId(customerId);
    }
}
