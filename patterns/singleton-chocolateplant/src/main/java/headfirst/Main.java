package headfirst;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("SIMPLE BOILER");
        ChocolateBoilerSimple Simpleboiler1 = ChocolateBoilerSimple.getInstance();
        Simpleboiler1.fill();
        ChocolateBoilerSimple Simpleboiler2 = ChocolateBoilerSimple.getInstance();
		Simpleboiler1.boil();
        Simpleboiler2.fill();
		Simpleboiler1.drain();

        System.out.println("-----------------------------------------------------------------------");
        System.out.println("SYNCHRONIZED BOILER");
        ChocolateBoilerSynchronized Synchronizedboiler1 = ChocolateBoilerSynchronized.getInstance();
        Synchronizedboiler1.fill();
        ChocolateBoilerSynchronized Synchronizedboiler2 = ChocolateBoilerSynchronized.getInstance();
        Synchronizedboiler1.boil();
        Synchronizedboiler2.fill();
        Synchronizedboiler1.drain();

        System.out.println("-----------------------------------------------------------------------");
        System.out.println("EAGERLY CREATED BOILER");
        ChocolateBoilerEagerlyCreated EagerlyCreatedboiler1 = ChocolateBoilerEagerlyCreated.getInstance();
        EagerlyCreatedboiler1.fill();
        ChocolateBoilerEagerlyCreated EagerlyCreatedboiler2 = ChocolateBoilerEagerlyCreated.getInstance();
		EagerlyCreatedboiler1.boil();
        EagerlyCreatedboiler2.fill();
		EagerlyCreatedboiler1.drain();

        System.out.println("-----------------------------------------------------------------------");
        System.out.println("ENUM BOILER");
        ChocolateBoilerEnum Enumboiler1 = ChocolateBoilerEnum.getInstance();
        Enumboiler1.fill();
        ChocolateBoilerEnum Enumboiler2 = ChocolateBoilerEnum.getInstance();
        Enumboiler1.boil();
        Enumboiler2.fill();
        Enumboiler1.drain();

        System.out.println("-----------------------------------------------------------------------");
        System.out.println("DOUBLE CHECKED LOCKING BOILER");
        ChocolateBoilerDoubleCheckedLocking DoubleCheckedLockingboiler1 = ChocolateBoilerDoubleCheckedLocking.getInstance();
        DoubleCheckedLockingboiler1.fill();
        ChocolateBoilerDoubleCheckedLocking DoubleCheckedLockingboiler2 = ChocolateBoilerDoubleCheckedLocking.getInstance();
        DoubleCheckedLockingboiler1.boil();
        DoubleCheckedLockingboiler2.fill();
        DoubleCheckedLockingboiler1.drain();
        System.out.println("-----------------------------------------------------------------------");
    }
}