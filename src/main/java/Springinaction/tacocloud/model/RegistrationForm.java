package Springinaction.tacocloud.model;

import Springinaction.tacocloud.domain.User;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author Elshad Jabbarov
 * 05.12.2021
 */

@Data
public class RegistrationForm {
    private String username;
    private String password;
    private String fullName;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String phone;

    public User toUser(PasswordEncoder passwordEncoder) {

        return new User(
                username, passwordEncoder.encode(password),
                fullName, street, city, state, zip, phone);
    }
}