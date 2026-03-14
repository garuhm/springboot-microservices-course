package com.microservices.accounts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class AccountsController {
    @GetMapping("sayHello")
    public String sayHello(){
        return "Hi, world!";
    }
}
