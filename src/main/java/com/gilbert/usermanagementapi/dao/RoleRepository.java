package com.gilbert.usermanagementapi.dao;

import com.gilbert.usermanagementapi.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findRoleByRoleName(String roleName);
}
