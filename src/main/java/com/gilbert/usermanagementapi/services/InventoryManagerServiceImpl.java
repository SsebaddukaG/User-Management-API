package com.gilbert.usermanagementapi.services;

import com.gilbert.usermanagementapi.dao.InventoryManagerRepository;
import com.gilbert.usermanagementapi.domain.InventoryManager;
import com.gilbert.usermanagementapi.domain.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InventoryManagerServiceImpl implements IInventoryManagerService {
    @Autowired
    private InventoryManagerRepository inventoryManagerRepository;

    @Autowired
    private IRoleService iRoleService;

    @Override
    public InventoryManager createInventoryManager(InventoryManager inventoryManager) {
        Role role = iRoleService.findRoleByRoleName("USER").get();
        if (role!=null)inventoryManager.addRole(role);
        return inventoryManagerRepository.save(inventoryManager);
    }

    @Override
    public Optional<InventoryManager> findInventoryManagerByFirstName(String firstName) {
        return inventoryManagerRepository.findInventoryManagerByFirstName(firstName);
    }

    @Override
    public void deleteInventoryManagerById(int id) {
        inventoryManagerRepository.deleteById(id);
    }
}
