package Springinaction.tacocloud.service;

import Springinaction.tacocloud.domain.User;
import Springinaction.tacocloud.repo.UserRepository;
import lombok.AllArgsConstructor;
import org.aspectj.lang.annotation.Before;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PrePersist;

/**
 * @author Elshad Jabbarov
 * 06.12.2021
 */
@Service
@AllArgsConstructor
public class DataLoader {
   private final EntityManager entityManager;
   private final PasswordEncoder encoder;
   private final UserRepository userRepository;

    @PostConstruct
    public void before(){
        userRepository.save(new User("user",
                encoder.encode("123"),
                "elsad","yasamal","baku",
                "aze","123","+994703662888"
        ));
    }
}
