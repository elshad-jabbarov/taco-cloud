package Springinaction.tacocloud.repository;

import Springinaction.tacocloud.domain.Order;

/**
 * @author Elshad Jabbarov
 * 28.11.2021
 */
public interface OrderRepository {

    Order save(Order order);
}
