package headfirst.IngredientFactory.Implementations;

import headfirst.IngredientFactory.PizzaIngredientFactory;
import headfirst.Ingredients.Cheese.Cheese;
import headfirst.Ingredients.Cheese.Implementations.ReggianoCheese;
import headfirst.Ingredients.Clams.Clams;
import headfirst.Ingredients.Clams.Implementations.FreshClams;
import headfirst.Ingredients.Dough.Dough;
import headfirst.Ingredients.Dough.Implementations.ThinCrustDough;
import headfirst.Ingredients.Pepperoni.Implementations.SlicedPepperoni;
import headfirst.Ingredients.Pepperoni.Pepperoni;
import headfirst.Ingredients.Sauce.Implementations.MarinaraSauce;
import headfirst.Ingredients.Sauce.Sauce;
import headfirst.Ingredients.Vegetables.Implementations.Garlic;
import headfirst.Ingredients.Vegetables.Implementations.Mushroom;
import headfirst.Ingredients.Vegetables.Implementations.Onion;
import headfirst.Ingredients.Vegetables.Implementations.RedPepper;
import headfirst.Ingredients.Vegetables.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FreshClams();
	}
}
