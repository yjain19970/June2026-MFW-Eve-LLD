package org.yourcompany.scaler.mfweveningjune26.javaadvconcepts;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExceptionExample {
    public static void main(String[] args) {
        System.out.println("Finding sum ------");
        int c =0;
        try{
            c = calculateSum(null, 15);
            ExecutorService ex = Executors.newCachedThreadPool();
        }catch(Exception e){
            // whatever code we write here will be honoured.
            System.out.println("Error happened.....");
            //throw e;
        }finally{
            // optional
            // add this finally block. 
            System.out.println("Executing the finally block....");
        }
        System.out.println("output is: " + c);
        

        // create custom exceptions and return them from the code
    }

    public static int calculateSum(Integer a, Integer b){
        return a+b;
    }
}
