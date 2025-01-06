package headfirst.designpatterns.ducks.Behaviours.FlyBehaviours;

import headfirst.designpatterns.ducks.Behaviours.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour{
    @Override
    public void fly(){
        System.out.println("I cannot fly!!");
    }
}
