package org.yourcompany.scaler.mfweveningjune26.solid;

public class Sparrow extends Bird implements Flyable {

    FlyingBehaviour behaviour;
    

    public Sparrow(FlyingBehaviour behaviour) {
        this.behaviour = behaviour;
    }
    // always...


    @Override   
    public void fly() {
        behaviour.fly();
    }
    
}


// Dependency Inversion Principle....
