package com.gilbert.usermanagementapi.services;

import com.gilbert.usermanagementapi.dao.InventoryManagerRepository;
import com.gilbert.usermanagementapi.domain.InventoryManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InventoryManagerServiceImpl implements IInventoryManagerService {
    @Autowired
    private InventoryManagerRepository inventoryManagerRepository;

    @Override
    public InventoryManager createInventoryManager(InventoryManager inventoryManager) {
        return inventoryManagerRepository.save(inventoryManager);
    }

    @Override
    public Optional<InventoryManager> findInventoryManagerByFirstName(String firstName) {
        return inventoryManagerRepository.findInventoryManagerByFirstname(firstName);
    }

    @Override
    public void deleteInventoryManagerById(int id) {
        inventoryManagerRepository.deleteById(id);
    }
}
