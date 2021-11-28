package Springinaction.tacocloud.config;

import Springinaction.tacocloud.domain.Ingredient;
import Springinaction.tacocloud.repository.IngredientRepository;
import org.springframework.core.convert.converter.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Elshad Jabbarov
 * 28.11.2021
 */
@Component
public class IngredientByIdConverter
        implements Converter<String, Ingredient> {

    private IngredientRepository ingredientRepo;

    @Autowired
    public IngredientByIdConverter(IngredientRepository ingredientRepo) {
        this.ingredientRepo = ingredientRepo;
    }

    @Override
    public Ingredient convert(String id) {
        return ingredientRepo.findOne(id);
    }
}
