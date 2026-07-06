package org.yourcompany.scaler.mfweveningjune26.multithreading.addersubractor;

import java.util.concurrent.locks.ReentrantLock;

public class Adder implements Runnable {
    private Count count;
    private ReentrantLock lock;

    // Lock p = new ReentrantLock();

    public Adder(Count count,ReentrantLock lock) {
        this.count = count;
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        System.out.println("lock taken by Adder");
        for (int i = 1; i <= 100000; i++) {
            count.value += 1;
            
        }
        lock.unlock();
        System.out.println("lock released by Adder");
    }
}
