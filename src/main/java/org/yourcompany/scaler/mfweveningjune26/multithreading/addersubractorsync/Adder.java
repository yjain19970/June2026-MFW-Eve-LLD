package org.yourcompany.scaler.mfweveningjune26.multithreading.addersubractorsync;

import java.util.concurrent.locks.ReentrantLock;

public class Adder implements Runnable {
    private Count count;

    // Lock p = new ReentrantLock();

    public Adder(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
            System.out.println("lock taken by Adder");
            for (int i = 1; i <= 100000; i++) {
                count.incrementValue(1);
            }
            System.out.println("lock released by Adder");
        
    }
}
