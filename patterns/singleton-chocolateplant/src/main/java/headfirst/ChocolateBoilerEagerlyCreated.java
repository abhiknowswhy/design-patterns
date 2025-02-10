package headfirst;

public class ChocolateBoilerEagerlyCreated {
	private boolean empty;
	private boolean boiled;
	private static final ChocolateBoilerEagerlyCreated uniqueInstance = new ChocolateBoilerEagerlyCreated();

	private ChocolateBoilerEagerlyCreated() {
		empty = true;
		boiled = false;
	}

	public static ChocolateBoilerEagerlyCreated getInstance() {
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
