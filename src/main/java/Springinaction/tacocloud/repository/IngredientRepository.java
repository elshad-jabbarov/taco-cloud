package Springinaction.tacocloud.repository;

import Springinaction.tacocloud.domain.Ingredient;

/**
 * @author Elshad Jabbarov
 * 27.11.2021
 */
public interface IngredientRepository {

    Iterable<Ingredient> findAll();

    Ingredient findOne(String id);

    Ingredient save(Ingredient ingredient);

}
