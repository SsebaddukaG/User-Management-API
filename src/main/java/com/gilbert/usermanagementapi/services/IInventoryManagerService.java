package com.gilbert.usermanagementapi.services;

import com.gilbert.usermanagementapi.domain.InventoryManager;
import org.springframework.stereotype.Service;

import java.util.Optional;
public interface IInventoryManagerService {
    InventoryManager createInventoryManager(InventoryManager inventoryManager);
    Optional<InventoryManager> findInventoryManagerByFirstName(String firstName);
    void deleteInventoryManagerById(int id);
}
