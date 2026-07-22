package org.yourcompany.scaler.mfweveningjune26.solid;

public class Pigeon extends Bird implements Flyable{

    // interface.
    FlyingBehaviour behaviour;
    
    public Pigeon(FlyingBehaviour behaviour) {
        this.behaviour = behaviour;
    }

    @Override
    public void fly() {
        behaviour.fly();
    }
    
}
