package com.example.springboot_login.Registration;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class RegistrationController {
    private RegistrationService registrationService;

    @GetMapping("/api/v1/registration")
    public String register(){
        return RegistrationService.register();
    }
}
