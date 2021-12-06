package Springinaction.tacocloud.repo;

import Springinaction.tacocloud.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Elshad Jabbarov
 * 04.12.2021
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
