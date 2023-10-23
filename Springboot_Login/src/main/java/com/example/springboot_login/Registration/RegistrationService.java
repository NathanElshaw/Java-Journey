package com.example.springboot_login.Registration;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {
    public static String register(RegistrationRequest request) {
        return "works";
    }
}
