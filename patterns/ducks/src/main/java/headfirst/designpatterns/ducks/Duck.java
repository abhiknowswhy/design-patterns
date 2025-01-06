package headfirst.designpatterns.ducks;

import headfirst.designpatterns.ducks.Behaviours.FlyBehaviour;
import headfirst.designpatterns.ducks.Behaviours.QuackBehaviour;

public abstract class Duck {

	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;

	public Duck() {}

	public abstract void Display();

	public void performFly() {
		flyBehaviour.fly();
	}

	public void performQuack() {
		quackBehaviour.quack();
	}

	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}

}
