package org.yourcompany.scaler.mfweveningjune26.designpattern.prototypedp;

public interface Prototype<T> {
    // This method is resposible for creating a new 
    // copy object of original, and returning it.
    T createCopy();
}
