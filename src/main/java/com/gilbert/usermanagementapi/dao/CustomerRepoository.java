package com.gilbert.usermanagementapi.dao;

import com.gilbert.usermanagementapi.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepoository extends JpaRepository<Customer, Integer> {
    Optional<Customer> findCustomerByFirstName(String firstName);
    Optional<Customer> findCustomerByCustomerCode(String customerCode);
    Optional<Customer> findAdministratorByUserName(String userName);
}
