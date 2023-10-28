package com.example.spring_security_learning.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class GreetingController {

    @GetMapping("/greet/message")
    public String Hello() {
        return "Hello";
        }
}
