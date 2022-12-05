package tn.demo.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.demo.customer.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
