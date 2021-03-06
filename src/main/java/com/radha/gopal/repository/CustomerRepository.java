package com.radha.gopal.repository;

import com.radha.gopal.model.Brand;
import com.radha.gopal.model.Customer;
import com.radha.gopal.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("customerRepository")
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
//    Customer findByCustomer(String Customer);

}
