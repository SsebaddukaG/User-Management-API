package com.gilbert.usermanagementapi.dao;

import com.gilbert.usermanagementapi.domain.InventoryManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
@Repository
@Transactional
public interface InventoryManagerRepository extends JpaRepository<InventoryManager, Integer> {
    Optional<InventoryManager> findInventoryManagerByFirstname(String name);
}
