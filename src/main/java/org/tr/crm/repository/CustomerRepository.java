package org.tr.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tr.crm.repository.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {
}
