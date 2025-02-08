package headfirst;

// Danger!  This implementation of Singleton not guaranteed to work prior to Java 5

// With double-checked locking, we first check to see if an instance is created, and if not, THEN we synchronize. This way, we only synchronize the first time through, just what we want.
// If performance is an issue in your use of the getInstance() method, then this method of implementing the Singleton can drastically reduce the overhead.


public class ChocolateBoilerDoubleCheckedLocking {
	private boolean empty;
	private boolean boiled;
	private static volatile ChocolateBoilerDoubleCheckedLocking uniqueInstance;

	private ChocolateBoilerDoubleCheckedLocking() {
		empty = true;
		boiled = false;
	}

	@SuppressWarnings("DoubleCheckedLocking")
	public static ChocolateBoilerDoubleCheckedLocking getInstance() {
		if (uniqueInstance == null) {
			synchronized (ChocolateBoilerDoubleCheckedLocking.class) {
				if (uniqueInstance == null){
					System.out.println("Creating unique instance of Chocolate Boiler");
					uniqueInstance = new ChocolateBoilerDoubleCheckedLocking();
				}
			}
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
