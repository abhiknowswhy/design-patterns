package designpatterns.Condiments;

import designpatterns.Beverage.Beverage;

public class Soy extends CondimentDecorator {
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		double cost = beverage.cost();
		if (null != beverage.getSize()) switch (beverage.getSize()) {
                case TALL -> cost += .15;
                case GRANDE -> cost += .20;
                case VENTI -> cost += .25;
                default -> { cost+= .15;}
            }
		return cost;
	}
}
