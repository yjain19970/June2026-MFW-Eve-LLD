package org.yourcompany.scaler.mfweveningjune26.javaadvconcepts;

import java.util.List;

public class Pair<T,V> {
    public T first;
    public V second;

    public Pair(T first, V second) {
        this.first = first;
        this.second = second;
    }

    public Pair(){}

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public V getSecond() {
        return second;
    }

    public void setSecond(V second) {
        this.second = second;
    }


    public void doSomething(T first){
        // whatever is the dataType of T using object creation, 
        // that will be honoured.
    }

    // <X> defines that this is generic.

    public static <T> List<T> doSomethingUsingStatic(T first){
        return null;
    }
    
}
