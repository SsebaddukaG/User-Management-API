package com.gilbert.usermanagementapi.dao;

import com.gilbert.usermanagementapi.domain.InventoryManager;
import com.gilbert.usermanagementapi.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findUserByUserName(String userName);
}
