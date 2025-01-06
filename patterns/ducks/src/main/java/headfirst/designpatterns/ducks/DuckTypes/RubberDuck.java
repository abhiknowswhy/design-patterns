package headfirst.designpatterns.ducks.DuckTypes;

import headfirst.designpatterns.ducks.Behaviours.FlyBehaviours.FlyNoWay;
import headfirst.designpatterns.ducks.Behaviours.QuackBehaviours.Squeak;
import headfirst.designpatterns.ducks.Duck;

public class RubberDuck extends Duck {
    
    public RubberDuck() {
		flyBehaviour = new FlyNoWay();
		quackBehaviour = new Squeak();
	}

	@Override
	public void Display() {
		System.out.println("I'm a Rubber duck");
	}

}
