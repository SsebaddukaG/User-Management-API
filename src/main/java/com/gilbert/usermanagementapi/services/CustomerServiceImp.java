package com.gilbert.usermanagementapi.services;

import com.gilbert.usermanagementapi.dao.CustomerRepoository;
import com.gilbert.usermanagementapi.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImp implements ICustomerService {
    @Autowired
    private CustomerRepoository customerRepoository;

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepoository.save(customer);
    }

    @Override
    public Optional<Customer> findCustomerByFirstName(String name) {
        return customerRepoository.findCustomerByFirstName(name);
    }

    @Override
    public void deleteCustomerById(int id) {
        customerRepoository.deleteById(id);
    }

    @Override
    public Optional<Customer> findCustomerByCustomerCode(String customerCode) {
        return customerRepoository.findCustomerByCustomerCode(customerCode);
    }
}
