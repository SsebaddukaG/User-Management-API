package com.gilbert.usermanagementapi.controllers;

import com.gilbert.usermanagementapi.domain.Customer;
import com.gilbert.usermanagementapi.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@PreAuthorize("hasAnyAuthority('ADMIN','CUSTOMER_ROLE')")
@RequestMapping(value = "/customer")
public class CustomerController {
    @Autowired
    private ICustomerService iCustomerService;

    @GetMapping(value = "/test")
    public String test(){
        return "Hello from customer";
    }

    @PostMapping(value = "/createCustomer", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Customer createCustomer(@RequestBody Customer customer){
        return iCustomerService.createCustomer(customer);
    }

    @GetMapping(value = "/findCustomerByFirstName{firstName}")
    public Customer findCustomerByFirstName(@PathVariable String firstName){
        return iCustomerService.findCustomerByFirstName(firstName).get();
    }

    @GetMapping(value = "/customerCode/{customerCode}")
    public Customer findCustomerByCode(@PathVariable String customerCode){
        return iCustomerService.findCustomerByCustomerCode(customerCode).get();
    }

    @GetMapping(value = "/findCustomerByUserName{userName}")
    public Customer findCustomerByUserName(@PathVariable String userName){
        return iCustomerService.findCustomerByFirstName(userName).get();
    }
}
