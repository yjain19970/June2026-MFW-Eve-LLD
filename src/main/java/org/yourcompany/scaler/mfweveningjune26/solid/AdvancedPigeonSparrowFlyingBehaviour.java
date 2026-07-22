package org.yourcompany.scaler.mfweveningjune26.solid;

public class AdvancedPigeonSparrowFlyingBehaviour implements FlyingBehaviour {

    private Object object;
    

    public AdvancedPigeonSparrowFlyingBehaviour(Object object) {
        this.object = object;
    }


    @Override
    public void fly() {
        System.out.println("Advanced method...");
    }
    
}
