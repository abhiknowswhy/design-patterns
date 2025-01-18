package headfirst.IngredientFactory;

import headfirst.Ingredients.Cheese.Cheese;
import headfirst.Ingredients.Clams.Clams;
import headfirst.Ingredients.Dough.Dough;
import headfirst.Ingredients.Pepperoni.Pepperoni;
import headfirst.Ingredients.Sauce.Sauce;
import headfirst.Ingredients.Vegetables.Veggies;

public interface PizzaIngredientFactory {

	public Dough createDough();

	public Sauce createSauce();

	public Cheese createCheese();

	public Veggies[] createVeggies();

	public Pepperoni createPepperoni();

	public Clams createClam();

}
