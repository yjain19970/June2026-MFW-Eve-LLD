package org.yourcompany.scaler.mfweveningjune26.multithreading.addersubractorsync;

// This class is a thread safe class.
public class Count {
    private Integer value =0;

    public Integer getValue() {
        return value;
    }

    public synchronized void incrementValue(int offset) {
        this.value +=offset;
    }
    
}
