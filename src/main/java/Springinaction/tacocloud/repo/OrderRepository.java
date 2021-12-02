package Springinaction.tacocloud.repo;

import Springinaction.tacocloud.domain.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Elshad Jabbarov
 * 29.11.2021
 */
@Repository
public interface OrderRepository
        extends CrudRepository<Order, Long> {

    List<Order> findByZip(String deliveryZip);
}
