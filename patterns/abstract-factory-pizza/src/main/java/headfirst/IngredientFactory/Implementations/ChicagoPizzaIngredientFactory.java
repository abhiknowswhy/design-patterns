package headfirst.IngredientFactory.Implementations;

import headfirst.IngredientFactory.PizzaIngredientFactory;
import headfirst.Ingredients.Cheese.Cheese;
import headfirst.Ingredients.Cheese.Implementations.MozzarellaCheese;
import headfirst.Ingredients.Clams.Clams;
import headfirst.Ingredients.Clams.Implementations.FrozenClams;
import headfirst.Ingredients.Dough.Dough;
import headfirst.Ingredients.Dough.Implementations.ThickCrustDough;
import headfirst.Ingredients.Pepperoni.Implementations.SlicedPepperoni;
import headfirst.Ingredients.Pepperoni.Pepperoni;
import headfirst.Ingredients.Sauce.Implementations.PlumTomatoSauce;
import headfirst.Ingredients.Sauce.Sauce;
import headfirst.Ingredients.Vegetables.Implementations.BlackOlives;
import headfirst.Ingredients.Vegetables.Implementations.Eggplant;
import headfirst.Ingredients.Vegetables.Implementations.Spinach;
import headfirst.Ingredients.Vegetables.Veggies;

public class ChicagoPizzaIngredientFactory
		implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new BlackOlives(),
				new Spinach(),
				new Eggplant() };
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FrozenClams();
	}
}
