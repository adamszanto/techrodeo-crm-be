package org.tr.crm.service;

import org.tr.crm.repository.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {
    List<CustomerDTO> getCustomers();
    void addCustomer(CustomerDTO customer);
    void deleteCustomer(String customerId);
}
