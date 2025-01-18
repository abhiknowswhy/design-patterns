package headfirst.PizzaStore.Implementations;

import headfirst.IngredientFactory.Implementations.ChicagoPizzaIngredientFactory;
import headfirst.IngredientFactory.PizzaIngredientFactory;
import headfirst.Pizza.Implementations.CheesePizza;
import headfirst.Pizza.Implementations.ClamPizza;
import headfirst.Pizza.Implementations.PepperoniPizza;
import headfirst.Pizza.Implementations.VeggiePizza;
import headfirst.Pizza.Pizza;
import headfirst.PizzaStore.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

		switch (item) {
			case "cheese" -> {
				pizza = new CheesePizza(ingredientFactory);
				pizza.setName("Chicago Style Cheese Pizza");
			}
			case "veggie" -> {
				pizza = new VeggiePizza(ingredientFactory);
				pizza.setName("Chicago Style Veggie Pizza");
			}
			case "clam" -> {
				pizza = new ClamPizza(ingredientFactory);
				pizza.setName("Chicago Style Clam Pizza");
			}
			case "pepperoni" -> {
				pizza = new PepperoniPizza(ingredientFactory);
				pizza.setName("Chicago Style Pepperoni Pizza");
			}
			default -> {
			}
		}
		return pizza;
	}
}
