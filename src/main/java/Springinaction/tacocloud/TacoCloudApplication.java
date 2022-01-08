package Springinaction.tacocloud;

import Springinaction.tacocloud.domain.Ingredient;
import Springinaction.tacocloud.domain.Taco;
import Springinaction.tacocloud.repo.IngredientRepository;
import Springinaction.tacocloud.repo.OrderRepository;
import Springinaction.tacocloud.repo.TacoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class TacoCloudApplication implements CommandLineRunner {
	private final IngredientRepository ingredientRepository;
	private final TacoRepository tacoRepository;
	private final OrderRepository orderRepository;

	public static void main(String[] args) {
		SpringApplication.run(TacoCloudApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		List<Ingredient> ingredients = new ArrayList<>();
		ingredients.add(new Ingredient("1", "armud", Ingredient.Type.CHEESE));
		ingredients.add(new Ingredient("2", "alma", Ingredient.Type.PROTEIN));
		ingredients.add(new Ingredient("3", "nar", Ingredient.Type.WRAP));
		ingredients.add(new Ingredient("4", "sdad", Ingredient.Type.VEGGIES));
		ingredients.add(new Ingredient("5", "arasdasdmud", Ingredient.Type.SAUCE));
		ingredientRepository.saveAll(ingredients);
		Taco taco = new Taco();
		Taco taco2 = new Taco();
		taco.setId(1L);
		taco.setIngredients(ingredients);
		taco.setName("elsadin");

		taco2.setId(2L);
		taco2.setIngredients(ingredients);
		taco2.setName("turalin");
		tacoRepository.save(taco2);
	}
}
