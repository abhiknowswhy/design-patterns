package headfirst.designpatterns.ducks.DuckTypes;

import headfirst.designpatterns.ducks.Behaviours.FlyBehaviours.FlyWithWings;
import headfirst.designpatterns.ducks.Behaviours.QuackBehaviours.Quack;
import headfirst.designpatterns.ducks.Duck;

public class MallardDuck extends Duck {

	public MallardDuck() {
		flyBehaviour = new FlyWithWings();
		quackBehaviour = new Quack();
	}

	@Override
	public void Display() {
		System.out.println("I'm a real Mallard duck");
	}
}
