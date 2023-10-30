package com.example.springboot_login.Security.Config;

        import com.example.springboot_login.AppUser.AppUserService;
        import lombok.AllArgsConstructor;
        import org.springframework.context.annotation.Bean;
        import org.springframework.context.annotation.Configuration;
        import org.springframework.http.HttpMethod;
        import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
        import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
        import org.springframework.security.config.annotation.web.builders.HttpSecurity;
        import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
        import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
        import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
        import org.springframework.security.web.SecurityFilterChain;

        import static org.springframework.security.config.Customizer.withDefaults;


@EnableWebSecurity
@Configuration
@AllArgsConstructor
public class WebSecurityConfig {

    private final AppUserService appUserService;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
       return http
               .authorizeHttpRequests(auth -> {
                   auth.requestMatchers("/api/v*/user/registration/**").permitAll();
               })
               .csrf(AbstractHttpConfigurer::disable)
                .formLogin(withDefaults())
                .build();
    }

    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.authenticationProvider(daoAuthenticationProvider());
    }

    @Bean
    public DaoAuthenticationProvider daoAuthenticationProvider(){
        DaoAuthenticationProvider provider =
                new DaoAuthenticationProvider();
        provider.setPasswordEncoder(bCryptPasswordEncoder);
        provider.setUserDetailsService(appUserService);
        return provider;
    }

}
