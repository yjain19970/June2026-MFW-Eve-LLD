package org.yourcompany.scaler.mfweveningjune26.javaadvconcepts;

import java.util.function.Consumer;

public class Lambdas {
    public static void main(String[] args) {
        Consumer<String> s = new ConsumeImpl();
        s.accept("Yash");

        // Way-2: Anonymous classes.
        Consumer<String> s2 = new Consumer<String>() {
            @Override
            public void accept(String t) {
                System.err.println("Hello, "+ t);
            }
        };
        s2.accept("Amrit!");


        // Way-3: using lambda.
        // (): input params
        // {} : function body.

        Consumer<String> s3 = (inp) -> {
            int x = 1;
            int y = 10;
            System.out.println("Hello, "+ inp + " "+ (x+y));
        };
        s3.accept("Nachiket");


        // Runnable.
        // threads...

        Runnable r1 = () -> {
            System.out.println("Hello word from new thread!");
        };
        Thread t1 = new Thread(r1);
        t1.start();

        // If your implementation is a single line -> do not need {}

        new Thread(
            () -> System.out.println("Hello word from new thread! " + Thread.currentThread().getName())
        ).start();



    }
}
