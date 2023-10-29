package com.example.springboot_login.AppUser;

import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AppUserService implements UserDetailsService {

    private final static String User_Not_Found_Message = "User with email %s not found";
    private final  AppUserRepository appUserRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public UserDetails loadUserByUsername(String email)
            throws UsernameNotFoundException {
        return appUserRepository.findByEmail(email).
                orElseThrow(()-> new UsernameNotFoundException(
                        String.format(User_Not_Found_Message, email)));
    }

    public String singUpUser(AppUser appUser){
        boolean userExist = appUserRepository
                .findByEmail(appUser.getEmail()).isPresent();
        if(userExist){
            throw new IllegalStateException("Email already exist!");
        }

        String encodedPassword = bCryptPasswordEncoder
                .encode(appUser.getPassword());

        appUser.setPassword(encodedPassword);

        // Todo: Send confirm email and insert user
        return "it works";
    }
}
