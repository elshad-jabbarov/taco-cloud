package Springinaction.tacocloud.repo;

import Springinaction.tacocloud.domain.Ingredient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Elshad Jabbarov
 * 29.11.2021
 */
@Repository
public interface IngredientRepository
        extends CrudRepository<Ingredient, String> {

}
