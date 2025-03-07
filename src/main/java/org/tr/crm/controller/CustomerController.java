package org.tr.crm.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class CustomerController {
    @GetMapping("/customers")
    public ResponseEntity<String> getCustomers() {
        System.out.println("getCustomers() called");
        return ResponseEntity.ok("Customer List");
    }
}
