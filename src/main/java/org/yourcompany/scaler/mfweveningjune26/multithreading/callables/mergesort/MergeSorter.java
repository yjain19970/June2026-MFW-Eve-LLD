package org.yourcompany.scaler.mfweveningjune26.multithreading.callables.mergesort;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

// Basic Merge Sort.
public class MergeSorter implements Callable<List<Integer>> {
    private List<Integer> arrayToSort;
    private ExecutorService executorService;

    public MergeSorter(List<Integer> arrayToSort, ExecutorService executorService) {
        this.arrayToSort = arrayToSort;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws Exception {
        System.out.println("Executing: " + arrayToSort + " thread: "+
            Thread.currentThread().getName()
        );

        // S1. breaking condition
        if (arrayToSort.size() <= 1) {
            return arrayToSort;
        }

        // S2. find mid
        int mid = arrayToSort.size() / 2;

        // S3. create leftArray
        List<Integer> leftArray = new ArrayList<>();
        for (int i = 0; i < mid; ++i) {
            leftArray.add(arrayToSort.get(i));
        }

        // S4. create rightArray
        List<Integer> rightArray = new ArrayList<>();
        for (int i = mid; i < arrayToSort.size(); ++i) {
            rightArray.add(arrayToSort.get(i));
        }


        // Recursive calls
        MergeSorter leftMergeSorter = new MergeSorter(leftArray, executorService);
        MergeSorter rightMergeSorter = new MergeSorter(rightArray, executorService);


        Future<List<Integer>> leftSortedArrayFuture = executorService.submit(leftMergeSorter); // [1]
        Future<List<Integer>> rightSortedArrayFuture = executorService.submit(rightMergeSorter); // [2]

        // GO FORWARD....
        List<Integer> leftSortedArray = leftSortedArrayFuture.get();
        List<Integer> rightSortedArray = rightSortedArrayFuture.get();

        // Merge step
        List<Integer> sortedArray = new ArrayList<>();


        int i = 0; // left array
        int j = 0; // right array
        // l: [1,2,3]
        // r: [4*,5]

        // [1,2,3]
        while (i < leftSortedArray.size() && j < rightSortedArray.size()) {
            if (leftSortedArray.get(i) < rightSortedArray.get(j)) {
                sortedArray.add(leftSortedArray.get(i++));
            } else {
                sortedArray.add(rightSortedArray.get(j++));
            }
        }

        while (i < leftSortedArray.size()) {
            sortedArray.add(leftSortedArray.get(i++));
        }

        while (j < rightSortedArray.size()) {
            sortedArray.add(rightSortedArray.get(j++));
        }
        // [1,2,3,4,5]

        return sortedArray;
    }
}