package com.gilbert.usermanagementapi.dao;

import com.gilbert.usermanagementapi.domain.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional()
public interface AdministratorRepository extends JpaRepository<Administrator, Integer> {
    Optional<Administrator> findAdministratorByFirstName(String name);
    Optional<Administrator> findAdministratorByUserName(String userName);
    void deleteAdministratorById(int id);
    Optional<Administrator> findAdministratorByAdminCode(String adminCode);
}
