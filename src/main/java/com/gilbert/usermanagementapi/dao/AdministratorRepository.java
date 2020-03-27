package com.gilbert.usermanagementapi.dao;

import com.gilbert.usermanagementapi.domain.Administrator;
import org.springframework.data.repository.CrudRepository;

public interface AdministratorRepository extends CrudRepository<Administrator, Integer> {
}
