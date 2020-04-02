package com.gilbert.usermanagementapi.controllers;

import com.gilbert.usermanagementapi.domain.InventoryManager;
import com.gilbert.usermanagementapi.services.IInventoryManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/inventoryManager")
@PreAuthorize("hasAnyAuthority('ADMIN','USER')")
public class InventoryManagerController {
    @Autowired
    private IInventoryManagerService iInventoryManagerService;

    @GetMapping(value = "/test")
    public String test(){
        return "hello from Inventory Manager";
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @PostMapping(value = "/createInventoryManager", consumes = MediaType.APPLICATION_JSON_VALUE)
    public InventoryManager createInventoryManager(@RequestBody InventoryManager inventoryManager){

        return iInventoryManagerService.createInventoryManager(inventoryManager);
    }

    @DeleteMapping(value = "deleteById/{id}")
    public void deleteInventoryManagerById(@PathVariable int id){
        iInventoryManagerService.deleteInventoryManagerById(id);
    }


    @GetMapping(value = "/findByFirstName/{firstName}")
    public InventoryManager findInventoryManagerByFirstName(@PathVariable String firstName){
        return iInventoryManagerService.findInventoryManagerByFirstName(firstName).get();
    }

    @GetMapping(value = "/findByUserName/{userName}")
    public InventoryManager findInventoryManagerByUserName(@PathVariable String userName){
        return iInventoryManagerService.findByUserName(userName).get();
    }
}
