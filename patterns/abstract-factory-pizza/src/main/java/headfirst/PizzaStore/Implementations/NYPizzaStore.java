package headfirst.PizzaStore.Implementations;

import headfirst.IngredientFactory.Implementations.NYPizzaIngredientFactory;
import headfirst.IngredientFactory.PizzaIngredientFactory;
import headfirst.Pizza.Implementations.CheesePizza;
import headfirst.Pizza.Implementations.ClamPizza;
import headfirst.Pizza.Implementations.PepperoniPizza;
import headfirst.Pizza.Implementations.VeggiePizza;
import headfirst.Pizza.Pizza;
import headfirst.PizzaStore.PizzaStore;

public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

		switch (item) {
			case "cheese" -> {
				pizza = new CheesePizza(ingredientFactory);
				pizza.setName("New York Style Cheese Pizza");
			}
			case "veggie" -> {
				pizza = new VeggiePizza(ingredientFactory);
				pizza.setName("New York Style Veggie Pizza");
			}
			case "clam" -> {
				pizza = new ClamPizza(ingredientFactory);
				pizza.setName("New York Style Clam Pizza");
			}
			case "pepperoni" -> {
				pizza = new PepperoniPizza(ingredientFactory);
				pizza.setName("New York Style Pepperoni Pizza");
			}
			default -> {
			}
		}
		return pizza;
	}
}
