package com.gilbert.usermanagementapi.dao;

import com.gilbert.usermanagementapi.domain.InventoryManager;
import org.springframework.data.repository.CrudRepository;

public interface InventoryManagerRepository extends CrudRepository<InventoryManager, Integer> {
}
