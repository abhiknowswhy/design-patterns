package headfirst.designpatterns.ducks;

import headfirst.designpatterns.ducks.DuckTypes.MallardDuck;
import headfirst.designpatterns.ducks.DuckTypes.RubberDuck;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.Display();
        mallard.performQuack();
        mallard.performFly();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.Display();
        rubberDuck.performQuack();
        rubberDuck.performFly();
    }
}