package com.gilbert.usermanagementapi.services;

import com.gilbert.usermanagementapi.dao.RoleRepository;
import com.gilbert.usermanagementapi.domain.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImp implements IRoleService {
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<Role> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public Role addRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public Optional<Role> findRoleByRoleName(String roleName) {
        return roleRepository.findRoleByRoleName(roleName);
    }
}
