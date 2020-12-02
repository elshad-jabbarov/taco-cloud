package tacocloud.demo.repository;

import org.springframework.data.repository.CrudRepository;
import tacocloud.demo.entity.Order;

import java.util.Date;
import java.util.List;

public interface OrderRepo extends CrudRepository<Order,Long> {
    List<Order> findByDeliveryZip(String deliveryZip);
    List<Order> findByOrdersByDeliveryZipAndPlacedAtBetween(
            String deliveryZip, Date startDate, Date endDate);
}
