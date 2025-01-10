package designpatterns.Condiments;

import designpatterns.Beverage.Beverage;

public class Mocha extends CondimentDecorator {
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		double cost = beverage.cost();
		if (null != beverage.getSize()) switch (beverage.getSize()) {
			case TALL -> cost += .20;
			case GRANDE -> cost += .30;
			case VENTI -> cost += .35;
			default -> { cost += .20;}
		}
		return cost;
	}}
