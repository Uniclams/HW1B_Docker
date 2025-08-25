package com.example.hw1b_docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
    public class WelcomeController {
    @GetMapping("/")
    public String HelloWorld(){
        return "Hello World";
    }

    @GetMapping("/welcome")
    public String Welcome(){
        return "Welcome to CS7319";
    }
}