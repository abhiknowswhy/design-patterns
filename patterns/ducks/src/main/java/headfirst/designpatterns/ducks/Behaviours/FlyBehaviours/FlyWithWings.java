package headfirst.designpatterns.ducks.Behaviours.FlyBehaviours;

import headfirst.designpatterns.ducks.Behaviours.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour{
    @Override
    public void fly(){
        System.out.println("I'm flying with wings!!");
    }
}
