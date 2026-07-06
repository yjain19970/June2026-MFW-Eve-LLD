package org.yourcompany.scaler.mfweveningjune26.multithreading.addersubractor;

import java.util.concurrent.locks.Lock;

public class Subractor implements Runnable {
    private Count count;
    private Lock lock;

    public Subractor(Count count, Lock lock) {
        this.count = count;
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        System.out.println("lock taken by Subractor");
        for (int i = 1; i <= 100000; i++) {
            count.value -= 1;
            //count.value += 1;
        }
        lock.unlock();
        System.out.println("lock released by Subractor");
    }    
}
