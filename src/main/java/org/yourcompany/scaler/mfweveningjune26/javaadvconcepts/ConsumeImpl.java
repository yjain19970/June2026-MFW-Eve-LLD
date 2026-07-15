package org.yourcompany.scaler.mfweveningjune26.javaadvconcepts;

import java.util.function.Consumer;

public class ConsumeImpl implements Consumer<String> {

    @Override
    public void accept(String t) {
        System.out.println("Hello, " + t);
    }
}
