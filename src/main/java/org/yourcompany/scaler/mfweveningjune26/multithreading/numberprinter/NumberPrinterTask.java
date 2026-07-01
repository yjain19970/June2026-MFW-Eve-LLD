package org.yourcompany.scaler.mfweveningjune26.multithreading.numberprinter;

public class NumberPrinterTask implements  Runnable {
    private int no;

    public NumberPrinterTask(int no) {
        this.no = no;
    }


    @Override
    public void run() {
        System.out.println("number: " +no +" printed by: " + 
                Thread.currentThread().getName()
            );
    }
    
}
