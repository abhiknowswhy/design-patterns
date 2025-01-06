package headfirst.designpatterns.ducks.Behaviours.QuackBehaviours;

import headfirst.designpatterns.ducks.Behaviours.QuackBehaviour;

public class Squeak implements QuackBehaviour{
    @Override
    public void quack(){
        System.out.println("Squeak!!");
    }
}
