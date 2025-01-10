package designpatterns.Condiments;

import designpatterns.Beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {

	Beverage beverage;

	@Override
	public abstract String getDescription();

	// @Override
	// public Size getSize() {
	// 	return beverage.getSize();
	// }

	// @Override
	// public void setSize(Size size) {
	// 	this.size = size;
	// }

}
