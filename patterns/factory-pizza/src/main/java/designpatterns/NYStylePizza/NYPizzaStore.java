package designpatterns.NYStylePizza;

import designpatterns.Pizza;
import designpatterns.PizzaStore;
import designpatterns.NYStylePizza.Pizzas.NYStyleCheesePizza;
import designpatterns.NYStylePizza.Pizzas.NYStyleClamPizza;
import designpatterns.NYStylePizza.Pizzas.NYStylePepperoniPizza;
import designpatterns.NYStylePizza.Pizzas.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String item) {
		return switch (item) {
			case "cheese" -> new NYStyleCheesePizza();
			case "veggie" -> new NYStyleVeggiePizza();
			case "clam" -> new NYStyleClamPizza();
			case "pepperoni" -> new NYStylePepperoniPizza();
			default -> throw new IllegalArgumentException("Unknown NY pizza type: " + item);
		};
	}
}
