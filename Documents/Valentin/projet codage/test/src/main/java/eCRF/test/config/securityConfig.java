package eCRF.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class securityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable())      // Désactive CSRF
                .authorizeHttpRequests(auth ->
                        auth.anyRequest().permitAll()   // Autorise toutes les requêtes
                )
                .formLogin(form -> form.disable())      // Désactive la page login
                .httpBasic(basic -> basic.disable());   // Désactive l'auth basic

        return http.build();
    }
}
