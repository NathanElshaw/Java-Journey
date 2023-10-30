package com.example.springboot_login.Registration;

import com.example.springboot_login.AppUser.AppUser;
import com.example.springboot_login.AppUser.AppUserRole;
import com.example.springboot_login.AppUser.AppUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {

    private final AppUserService appUserService;
    private final EmailValidator emailValidator;
    public String register(RegistrationRequest request) {
        boolean isValid = emailValidator
                .test(request.getEmail());

        if(!isValid || request.getEmail() == null){
            throw new IllegalStateException("Email is not Valid");
        }
        return appUserService.singUpUser(new AppUser(
                request.getFirstName(),
                request.getLastName(),
                request.getEmail(),
                request.getPassword(),
                AppUserRole.User
        ));
    }
}
