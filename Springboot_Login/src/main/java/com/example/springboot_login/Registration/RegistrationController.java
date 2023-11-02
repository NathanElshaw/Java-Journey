package com.example.springboot_login.Registration;

import com.example.springboot_login.AppUser.AppUser;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/api/v1/user")
public class RegistrationController {
    private RegistrationService registrationService;

    @PostMapping ("/registration")
    public String register(@RequestBody RegistrationRequest userPayload){

        return registrationService.register(userPayload);
    }

    @GetMapping("/registration/confirm")
    public String confirmToken(@RequestParam("token") String token){
        return registrationService.confirmToken(token);
    }

}
