package designpatterns;

import designpatterns.ChicagoStylePizza.Pizzas.ChicagoStyleCheesePizza;
import designpatterns.ChicagoStylePizza.Pizzas.ChicagoStyleClamPizza;
import designpatterns.ChicagoStylePizza.Pizzas.ChicagoStylePepperoniPizza;
import designpatterns.ChicagoStylePizza.Pizzas.ChicagoStyleVeggiePizza;
import designpatterns.NYStylePizza.Pizzas.NYStyleCheesePizza;
import designpatterns.NYStylePizza.Pizzas.NYStyleClamPizza;
import designpatterns.NYStylePizza.Pizzas.NYStylePepperoniPizza;
import designpatterns.NYStylePizza.Pizzas.NYStyleVeggiePizza;

@SuppressWarnings("")
public class DependentPizzaStore {

    public Pizza createPizza(String style, String type) {
        Pizza pizza = null;
        switch (style) {
            case "NY" -> {
                switch (type) {
                    case "cheese" -> pizza = new NYStyleCheesePizza();
                    case "veggie" -> pizza = new NYStyleVeggiePizza();
                    case "clam" -> pizza = new NYStyleClamPizza();
                    case "pepperoni" -> pizza = new NYStylePepperoniPizza();
                    default -> throw new IllegalArgumentException("Unknown NY pizza type: " + type);
                }
            }

            case "Chicago" -> {
                switch (type) {
                    case "cheese" -> pizza = new ChicagoStyleCheesePizza();
                    case "veggie" -> pizza = new ChicagoStyleVeggiePizza();
                    case "clam" -> pizza = new ChicagoStyleClamPizza();
                    case "pepperoni" -> pizza = new ChicagoStylePepperoniPizza();
                    default -> throw new IllegalArgumentException("Unknown Chicago pizza type: " + type);
                }
            }

            default -> {
                throw new IllegalArgumentException("Unknown Pizza style: " + style);
            }
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
