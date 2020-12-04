package tacocloud.demo.repository;


import org.springframework.data.repository.CrudRepository;
import tacocloud.demo.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}