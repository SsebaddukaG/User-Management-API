package com.gilbert.usermanagementapi.dao;

import com.gilbert.usermanagementapi.domain.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepoository extends CrudRepository<Customer, Integer> {
}
