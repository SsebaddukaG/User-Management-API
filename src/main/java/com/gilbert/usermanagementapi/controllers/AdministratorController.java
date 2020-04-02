package com.gilbert.usermanagementapi.controllers;

import com.gilbert.usermanagementapi.domain.Administrator;
import com.gilbert.usermanagementapi.domain.User;
import com.gilbert.usermanagementapi.services.IAdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.PermitAll;

@RestController
@RequestMapping(value = "/admin")
@PreAuthorize("hasAuthority('ADMIN')")
public class AdministratorController {
    @Autowired
    private IAdministratorService iAdministratorService;

    @GetMapping(value = "/test")
    public String test(){
        return "Hello from admin";
    }

    @PostMapping (value = "/createAdmin", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Administrator createAdmin(@RequestBody Administrator administrator){
        System.err.println(administrator);
        return iAdministratorService.createAdmin(administrator);
    }

    public Administrator findByName(@PathVariable String firstName){
        return iAdministratorService.findAdministratorByFirstname(firstName).get();
    }

    @GetMapping(value = "/adminCode/{adminCode}")
    public Administrator findByAdminCode(@PathVariable String adminCode){
        return iAdministratorService.findAdministratorByAdminCode(adminCode).get();
    }

    @GetMapping(value = "/findByUserName/{userName}")
    public Administrator findByUserName(@PathVariable String userName){
        return iAdministratorService.findByUserName(userName).get();
    }

}
