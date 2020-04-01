package com.gilbert.usermanagementapi.services;

import com.gilbert.usermanagementapi.dao.AdministratorRepository;
import com.gilbert.usermanagementapi.domain.Administrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class AdministratorServiceImp implements IAdministratorService {

    @Autowired
    private AdministratorRepository administratorRepository;

    @Autowired
    private IRoleService iRoleService;

    @Override
    public Administrator createAdmin(Administrator administrator) {
        administrator.setRoles(iRoleService.findAll());
        return administratorRepository.save(administrator);
    }

    @Override
    public Optional<Administrator> findAdministratorByFirstname(String name) {
        return administratorRepository.findAdministratorByFirstName(name);
    }

    @Override
    public void deleteAdminById(int id) {
        administratorRepository.deleteAdministratorById(id);
    }

    @Override
    public Optional<Administrator> findAdministratorByAdminCode(String adminCode) {
        return administratorRepository.findAdministratorByAdminCode(adminCode);
    }
}
