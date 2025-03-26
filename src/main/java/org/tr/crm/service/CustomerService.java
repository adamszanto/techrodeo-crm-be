package org.tr.crm.service;

import org.tr.crm.repository.dto.CustomerDTO;
import org.tr.crm.repository.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<CustomerDTO> getCustomers();
    CustomerDTO addCustomer(CustomerDTO customer);
    void deleteCustomer(Long customerId);
}
