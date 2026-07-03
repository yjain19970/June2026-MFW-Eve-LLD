package org.yourcompany.scaler.mfweveningjune26.multithreading.callables.mergesort;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSorterClient {
        public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newCachedThreadPool();
        //NumberGenerator numberGenerator = new NumberGenerator(10);
        //executorService.submit(numberGenerator);
        
     
        List<Integer> list = List.of(7, 3, 4, 1, 9, 8, 2, 6);
        
        MergeSorter mergeSorter = new MergeSorter(list, executorService);
        Future<List<Integer>> outputFuture =  executorService.submit(mergeSorter);

        System.out.println("futureObject: " + outputFuture);
        System.out.println("Output: " + outputFuture.get());

        executorService.shutdown();

    }
}
