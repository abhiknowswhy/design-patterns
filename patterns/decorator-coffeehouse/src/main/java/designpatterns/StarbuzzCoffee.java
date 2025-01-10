package designpatterns;

import designpatterns.Beverage.Beverage;
import designpatterns.Beverage.Beverage.Size;
import designpatterns.Beverage.DarkRoast;
import designpatterns.Beverage.Espresso;
import designpatterns.Beverage.HouseBlend;
import designpatterns.Condiments.Mocha;
import designpatterns.Condiments.Soy;
import designpatterns.Condiments.Whip;
import designpatterns.Condiments.doubleMocha;

public class StarbuzzCoffee {

	public static void main(String args[]) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() 
				+ " $" + beverage.cost());

		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() 
				+ " $" + beverage2.cost());

		Beverage beverage3 = new HouseBlend();
		beverage3.setSize(Size.GRANDE);
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() 
				+ " $" + beverage3.cost());

		Beverage beverage4 = new HouseBlend();
		beverage4.setSize(Size.VENTI);
		beverage4 = new Soy(beverage4);
		beverage4 = new doubleMocha(beverage4);
		beverage4 = new Whip(beverage4);
		System.out.println(beverage4.getDescription() 
				+ " $" + beverage4.cost());
	}
}
