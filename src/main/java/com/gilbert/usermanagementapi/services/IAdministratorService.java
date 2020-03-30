package com.gilbert.usermanagementapi.services;

import com.gilbert.usermanagementapi.domain.Administrator;

import java.util.Optional;

public interface IAdministratorService {
     Administrator createAdmin(Administrator administrator);
     Optional<Administrator> findAdministratorByFirstname(String name);
     void deleteAdminById(int id);
}
