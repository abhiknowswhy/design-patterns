package designpatterns.ChicagoStylePizza;

import designpatterns.ChicagoStylePizza.Pizzas.ChicagoStyleCheesePizza;
import designpatterns.ChicagoStylePizza.Pizzas.ChicagoStyleClamPizza;
import designpatterns.ChicagoStylePizza.Pizzas.ChicagoStylePepperoniPizza;
import designpatterns.ChicagoStylePizza.Pizzas.ChicagoStyleVeggiePizza;
import designpatterns.Pizza;
import designpatterns.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String item) {
		return switch (item) {
			case "cheese" -> new ChicagoStyleCheesePizza();
			case "veggie" -> new ChicagoStyleVeggiePizza();
			case "clam" -> new ChicagoStyleClamPizza();
			case "pepperoni" -> new ChicagoStylePepperoniPizza();
			default -> throw new IllegalArgumentException("Unknown Chicago pizza type: " + item);
		};
	}
}
