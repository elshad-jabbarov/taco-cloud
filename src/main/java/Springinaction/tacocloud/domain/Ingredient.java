package Springinaction.tacocloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Elshad Jabbarov
 * 18.11.2021
 */
@Data
@AllArgsConstructor
public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;

    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
