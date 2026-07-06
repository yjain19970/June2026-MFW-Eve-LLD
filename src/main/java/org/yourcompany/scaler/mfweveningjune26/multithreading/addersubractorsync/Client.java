package org.yourcompany.scaler.mfweveningjune26.multithreading.addersubractorsync;

import java.util.concurrent.locks.ReentrantLock;


public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count c = new Count(); // shared var
        Adder adder = new Adder(c);
        Subractor subractor = new Subractor(c);
        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subractor);

        t1.start();
        t2.start();


        t1.join(); // wait.
        t2.join(); // wait untill thread execution is completed.
        System.out.println("Sync demo Value is:  " + c.getValue());
    }    
}
