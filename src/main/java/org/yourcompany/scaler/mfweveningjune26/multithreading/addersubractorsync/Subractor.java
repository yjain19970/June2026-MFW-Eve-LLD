package org.yourcompany.scaler.mfweveningjune26.multithreading.addersubractorsync;


public class Subractor implements Runnable {
    private Count count;

    public Subractor(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
            System.out.println("lock taken by Subractor");
            for (int i = 1; i <= 100000; i++) {
                count.incrementValue(-1);
            }
            System.out.println("lock released by Subractor");
    }    
}
