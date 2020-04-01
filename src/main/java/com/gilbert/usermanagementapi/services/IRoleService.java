package com.gilbert.usermanagementapi.services;

import com.gilbert.usermanagementapi.domain.Role;

import java.util.List;
import java.util.Optional;

public interface IRoleService {
    List<Role> findAll();
    Role addRole(Role role);
    Optional<Role> findRoleByRoleName(String roleName);
}
