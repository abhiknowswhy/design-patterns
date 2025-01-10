package designpatterns.Condiments;

import designpatterns.Beverage.Beverage;

public class doubleMocha extends CondimentDecorator {
	public doubleMocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", double Mocha";
	}

	@Override
	public double cost() {
		double cost = beverage.cost();
		if (null != beverage.getSize()) switch (beverage.getSize()) {
			case TALL -> cost += .35;
			case GRANDE -> cost += .55;
			case VENTI -> cost += .65;
			default -> { cost += .35;}
		}
		return cost;
	}
}
