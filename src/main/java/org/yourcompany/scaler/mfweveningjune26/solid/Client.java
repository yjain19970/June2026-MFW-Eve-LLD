package org.yourcompany.scaler.mfweveningjune26.solid;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Bird b1 = new Peacock();
        //b1.fly();

        Bird b2 = new Sparrow();
        //b2.fly();

        List<Bird> birds = new ArrayList<>();
        birds.add(new Penguin());
        birds.add(new Sparrow());
        birds.add(new Peacock());

        Bird b4 = new Pigeon(new AdvancedPigeonSparrowFlyingBehaviour());
        
        Bird b5 = new Pigeon(new PigeonSparrowFlyingBehaviour());
        

        doSomething(birds);
    }

    private static void doSomething(List<Bird> birds) {
        for(Bird b: birds){
            if(b.getType().equals("Penguin")){
                continue;
            }

            b.fly();
        }
        // Liscov's substituion principle says...
        /*
            All the children should be treated equally.
        */
    }
}
