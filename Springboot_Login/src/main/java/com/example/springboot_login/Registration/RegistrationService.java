package com.example.springboot_login.Registration;

import com.example.springboot_login.AppUser.AppUser;
import com.example.springboot_login.AppUser.AppUserRole;
import com.example.springboot_login.AppUser.AppUserService;
import com.example.springboot_login.Registration.Token.ConfirmationToken;
import com.example.springboot_login.Registration.Token.ConfirmationTokenService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class RegistrationService {

    private final AppUserService appUserService;
    private final EmailValidator emailValidator;
    private final ConfirmationTokenService confirmationTokenService;

    public String register(RegistrationRequest request) {
        boolean isValid = emailValidator
                .test(request.getEmail());

        if (!isValid || request.getEmail() == null) {
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

    public String confirmToken(String token){
        ConfirmationToken confirmationToken = confirmationTokenService.getToken(token).orElseThrow(()->
                new IllegalStateException("token not found")
                );

        if(confirmationToken.getConfirmedAt() != null){
            throw new IllegalStateException("email already confirmed");
        }

        LocalDateTime expiresAt = confirmationToken.getExpiresAt();

        if(expiresAt.isBefore(LocalDateTime.now())){
            throw new IllegalStateException("token is expired");
        }

        confirmationTokenService.setConfirmedAt(token);
        appUserService.enableAppUser(
                confirmationToken.getAppUser().getEmail()
        );
        return "confirmed";
    }
}
