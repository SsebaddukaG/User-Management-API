package com.gilbert.usermanagementapi.services;

import com.gilbert.usermanagementapi.dao.AdministratorRepository;
import com.gilbert.usermanagementapi.domain.Administrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdministratorServiceImp implements IAdministratorService {

    @Autowired
    private AdministratorRepository administratorRepository;

    @Override
    public Administrator createAdmin(Administrator administrator) {
        return administratorRepository.save(administrator);
    }

    @Override
    public Optional<Administrator> findAdministratorByFirstname(String name) {
        return administratorRepository.findAdministratorByFirstname(name);
    }

    @Override
    public void deleteAdminById(int id) {
        administratorRepository.deleteAdministratorById(id);
    }
}
