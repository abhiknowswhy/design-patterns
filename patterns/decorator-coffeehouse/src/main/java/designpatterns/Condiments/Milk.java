package designpatterns.Condiments;

import designpatterns.Beverage.Beverage;

public class Milk extends CondimentDecorator {
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	@Override
	public double cost() {
		double cost = beverage.cost();
		if (null != beverage.getSize()) switch (beverage.getSize()) {
			case TALL -> cost += .10;
			case GRANDE -> cost += .15;
			case VENTI -> cost += .20;
			default -> { cost += .10;}
		}
		return cost;
	}
}
