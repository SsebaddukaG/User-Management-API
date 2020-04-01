package com.gilbert.usermanagementapi.services;

import com.gilbert.usermanagementapi.domain.Customer;
import org.springframework.stereotype.Service;

import java.util.Optional;
public interface ICustomerService {
    Customer createCustomer(Customer customer);
    Optional<Customer> findCustomerByFirstName(String name);
    void deleteCustomerById(int id);
    Optional<Customer> findCustomerByCustomerCode(String customerCode);
}
