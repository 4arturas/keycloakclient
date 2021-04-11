package com.example.keycloakclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller
{
    @GetMapping("/")
    public String hello()
    {
        return "Hello";
    }

    @GetMapping("/customers")
    public String customers()
    {
        return "customers";
    }

    @GetMapping("/users")
    public String users()
    {
        return "users";
    }

}
