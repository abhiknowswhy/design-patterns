
# Factory pattern

This folder contains an example of `Factory pattern` - through the example of an Pizza Store example.

The Factory Method Pattern defines an interface for creating an object, but lets subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses. The Factory Method Pattern gives us a way to encapsulate the instantiations of concrete types. 

The Factory Method pattern lets subclasses decide which class to instantiate. Because the Creator class is written without knowledge of the actual products that will be created, we say “decide” not because the pattern allows subclasses themselves to decide, but rather, because the decision actually comes down to which subclass is used to create the product.

This method is a direct derivative of "Dependency inversion principle" - which says "Depend upon abstractions. Do not depend upon concrete classes." In simpler words, it suggests that our high-level components should not depend on our low-level components; rather, they should both depend on abstractions and our Factory pattern allows us to do just that.

> Output of the code:

```
--- Making a NY Style Sauce and Cheese Pizza ---
Prepare NY Style Sauce and Cheese Pizza
Tossing dough...
Adding sauce...
Adding toppings: 
   Grated Reggiano Cheese
Bake for 25 minutes at 350
Cut the pizza into diagonal slices
Place pizza in official PizzaStore box
Ethan ordered a NY Style Sauce and Cheese Pizza

--- Making a Chicago Style Deep Dish Cheese Pizza ---
Prepare Chicago Style Deep Dish Cheese Pizza
Tossing dough...
Adding sauce...
Adding toppings: 
   Shredded Mozzarella Cheese
Bake for 25 minutes at 350
Cutting the pizza into square slices
Place pizza in official PizzaStore box
Joel ordered a Chicago Style Deep Dish Cheese Pizza

--- Making a NY Style Clam Pizza ---
Prepare NY Style Clam Pizza
Tossing dough...
Adding sauce...
Adding toppings: 
   Grated Reggiano Cheese
   Fresh Clams from Long Island Sound
Bake for 25 minutes at 350
Cut the pizza into diagonal slices
Place pizza in official PizzaStore box
Ethan ordered a NY Style Clam Pizza

--- Making a Chicago Style Clam Pizza ---
Prepare Chicago Style Clam Pizza
Tossing dough...
Adding sauce...
Adding toppings: 
   Shredded Mozzarella Cheese
   Frozen Clams from Chesapeake Bay
Bake for 25 minutes at 350
Cutting the pizza into square slices
Place pizza in official PizzaStore box
Joel ordered a Chicago Style Clam Pizza

--- Making a NY Style Pepperoni Pizza ---
Prepare NY Style Pepperoni Pizza
Tossing dough...
Adding sauce...
Adding toppings: 
   Grated Reggiano Cheese
   Sliced Pepperoni
   Garlic
   Onion
   Mushrooms
   Red Pepper
Bake for 25 minutes at 350
Cut the pizza into diagonal slices
Place pizza in official PizzaStore box
Ethan ordered a NY Style Pepperoni Pizza

--- Making a Chicago Style Pepperoni Pizza ---
Prepare Chicago Style Pepperoni Pizza
Tossing dough...
Adding sauce...
Adding toppings: 
   Shredded Mozzarella Cheese
   Black Olives
   Spinach
   Eggplant
   Sliced Pepperoni
Bake for 25 minutes at 350
Cutting the pizza into square slices
Place pizza in official PizzaStore box
Joel ordered a Chicago Style Pepperoni Pizza

--- Making a NY Style Veggie Pizza ---
Prepare NY Style Veggie Pizza
Tossing dough...
Adding sauce...
Adding toppings: 
   Grated Reggiano Cheese
   Garlic
   Onion
   Mushrooms
   Red Pepper
Bake for 25 minutes at 350
Cut the pizza into diagonal slices
Place pizza in official PizzaStore box
Ethan ordered a NY Style Veggie Pizza

--- Making a Chicago Deep Dish Veggie Pizza ---
Prepare Chicago Deep Dish Veggie Pizza
Tossing dough...
Adding sauce...
Adding toppings: 
   Shredded Mozzarella Cheese
   Black Olives
   Spinach
   Eggplant
Bake for 25 minutes at 350
Cutting the pizza into square slices
Place pizza in official PizzaStore box
Joel ordered a Chicago Deep Dish Veggie Pizza
```
