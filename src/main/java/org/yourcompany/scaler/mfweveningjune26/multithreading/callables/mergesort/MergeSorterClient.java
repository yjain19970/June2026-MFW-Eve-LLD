package org.yourcompany.scaler.mfweveningjune26.multithreading.callables.mergesort;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MergeSorterClient {
        public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        //NumberGenerator numberGenerator = new NumberGenerator(10);
        //executorService.submit(numberGenerator);
        
     
        List<Integer> list = List.of(7, 3, 4, 1, 9, 8, 2, 6);
        
        MergeSorter mergeSorter = new MergeSorter(list);
        List<Integer> output =  mergeSorter.call();
        System.out.println("list: " + output);
    }
}
