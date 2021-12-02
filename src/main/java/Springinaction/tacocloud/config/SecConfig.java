package Springinaction.tacocloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author Elshad Jabbarov
 * 02.12.2021
 */
@Configuration
@EnableWebSecurity
public class SecConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //in memory user store
        auth
                .inMemoryAuthentication()
                .withUser("buzz")
                .password(getPasswordEncoder().encode("123"))
                .authorities("ROLE_USER")
                .and()
                .withUser("woody")
                .password(getPasswordEncoder().encode("123"))
                .authorities("ROLE_USER");


    }


    @Bean
    PasswordEncoder getPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
