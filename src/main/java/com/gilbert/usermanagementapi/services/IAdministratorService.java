package com.gilbert.usermanagementapi.services;

import com.gilbert.usermanagementapi.domain.Administrator;
import com.gilbert.usermanagementapi.domain.User;

import java.util.Optional;

public interface IAdministratorService{
     Administrator createAdmin(Administrator administrator);
     Optional<Administrator> findAdministratorByFirstname(String name);
     void deleteAdminById(int id);
     Optional<Administrator> findAdministratorByAdminCode(String adminCode);
     Optional<Administrator> findByUserName(String userName);
}
