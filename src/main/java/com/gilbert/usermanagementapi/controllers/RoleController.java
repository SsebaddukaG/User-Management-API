package com.gilbert.usermanagementapi.controllers;

import com.gilbert.usermanagementapi.domain.Role;
import com.gilbert.usermanagementapi.services.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "role")
public class RoleController {
    @Autowired
    private IRoleService iRoleService;

    @GetMapping(value = "/test")
    public String test(){
        return "Hello from Role service";
    }

    @PostMapping(value = "/addRole", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Role addRole(@RequestBody Role role){
        return iRoleService.addRole(role);
    }

    @GetMapping(value = "/roles")
    public List<Role> findAllRoles(){
        return iRoleService.findAll();
    }

    @GetMapping(value = "findRoleByName/{name}")
    public Role findRoleByName(@PathVariable String name){
        return iRoleService.findRoleByRoleName(name).get();
    }
}
