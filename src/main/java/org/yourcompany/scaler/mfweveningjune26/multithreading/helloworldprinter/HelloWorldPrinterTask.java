package org.yourcompany.scaler.mfweveningjune26.multithreading.helloworldprinter;

public class HelloWorldPrinterTask implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello world, thread name: "+ 
            Thread.currentThread().getName());
    }
    
}
