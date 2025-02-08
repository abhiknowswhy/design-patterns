package headfirst;

// NOTE: This is not thread safe!

public class ChocolateBoilerSimple {
	private boolean empty;
	private boolean boiled;
	private static ChocolateBoilerSimple uniqueInstance;

	private ChocolateBoilerSimple() {
		empty = true;
		boiled = false;
	}

	public static ChocolateBoilerSimple getInstance() {
		if (uniqueInstance == null) {
			System.out.println("Creating unique instance of Chocolate Boiler");
			uniqueInstance = new ChocolateBoilerSimple();
		}
		System.out.println("Returning instance of Chocolate Boiler");
		return uniqueInstance;
	}

	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
			// fill the boiler with a milk/chocolate mixture
			System.out.println("Filled the boiler with a milk/chocolate mixture");
		} else {
			System.out.println("WARNING: Boiler already full!");
		}
	}

	public void drain() {
		if (!isEmpty() && isBoiled()) {
			// drain the boiled milk and chocolate
			empty = true;
			System.out.println("Drained the boiled milk and chocolate");
		} else {
			System.out.println("WARNING: Boiler already empty!");
		}
	}

	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			// bring the contents to a boil
			boiled = true;
			System.out.println("Boiled the contents to a boil");
		} else if (!isEmpty()) {
			System.out.println("WARNING: Contents already boiled!");
		} else {
			System.out.println("WARNING: Fill the contents first!");
		}
	}

	public boolean isEmpty() {
		return empty;
	}

	public boolean isBoiled() {
		return boiled;
	}
}
