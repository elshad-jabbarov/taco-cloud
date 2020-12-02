package tacocloud.demo.repository;


import org.springframework.data.repository.CrudRepository;
import tacocloud.demo.entity.Ingredient;

public interface IngredientRepo extends CrudRepository<Ingredient,String> {
}
