package Springinaction.tacocloud.repository;

import Springinaction.tacocloud.domain.Taco;

/**
 * @author Elshad Jabbarov
 * 28.11.2021
 */
public interface TacoRepository {

    Taco save(Taco design);
}
