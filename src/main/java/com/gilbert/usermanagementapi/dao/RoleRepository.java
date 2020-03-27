package com.gilbert.usermanagementapi.dao;

import com.gilbert.usermanagementapi.domain.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Integer> {
}
