package org.tr.crm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tr.crm.repository.CustomerRepository;
import org.tr.crm.repository.dto.CustomerDTO;
import org.tr.crm.repository.entity.Customer;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public void addCustomer(CustomerDTO customer) {
        Customer newCustomer = new Customer();

        newCustomer.setName(customer.getName());
        newCustomer.setAge(customer.getAge());
        newCustomer.setAddress(customer.getAddress());
        customerRepository.save(newCustomer);
    }

    @Override
    public void deleteCustomer(String customerId) {
        customerRepository.deleteById(customerId);
    }
}
