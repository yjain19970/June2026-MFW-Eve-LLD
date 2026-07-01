package org.yourcompany.scaler.mfweveningjune26.multithreading;

import org.yourcompany.scaler.mfweveningjune26.multithreading.numberprinter.NumberPrinterTask;

public class Client {
    public static void main(String[] args) {
        System.out.println("Inside main func: "+
            Thread.currentThread().getName()
        );
        // Runnable hwpt = new HelloWorldPrinterTask();
        // Thread t1 = new Thread(hwpt);
        // t1.start();

        for(int i=1;i<=15;i++){
            NumberPrinterTask npt = new NumberPrinterTask(i);
            Thread t2 = new Thread(npt);
            t2.start();            
        }



    }
}

/*

print numbers 1 to 15, using one thread other than main

Task: printNumber



print number 1 to 15 -> EACH WITH A NEW THREAD....


*/