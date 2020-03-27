package com.gilbert.usermanagementapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {
    @GetMapping(value = "/test")
    public String test(){
        return "Hello world";
    }
}
