package org.tr.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.tr.crm.repository.dto.CustomerDTO;
import org.tr.crm.repository.entity.Customer;
import org.tr.crm.service.CustomerService;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("/customers")
    public List<CustomerDTO> getCustomers() {
        System.out.println("getCustomers() called");
        return customerService.getCustomers();
    }

    @PostMapping("/customer")
    public ResponseEntity<String> addCustomer(@RequestBody CustomerDTO customer) {
        customerService.addCustomer(customer);
        return ResponseEntity.ok("Customer added successfully");
    }

    @DeleteMapping("/customer/{id}")
    public ResponseEntity<String> deleteCustomer(@PathVariable String id) {
        customerService.deleteCustomer(id);  // MongoDB-ből töröljük az ügyfelet
        return ResponseEntity.ok("Customer deleted successfully");
    }
}
