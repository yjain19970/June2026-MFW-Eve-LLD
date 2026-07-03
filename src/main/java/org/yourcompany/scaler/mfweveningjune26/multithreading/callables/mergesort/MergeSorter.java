package org.yourcompany.scaler.mfweveningjune26.multithreading.callables.mergesort;


import java.util.ArrayList;
import java.util.List;

// Basic Merge Sort.
public class MergeSorter {

    private List<Integer> arrayToSort;

    public MergeSorter(List<Integer> arrayToSort) {
        this.arrayToSort = arrayToSort;
    }

    public List<Integer> call() throws Exception {
        System.out.println("Executing: " + arrayToSort);

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
        MergeSorter leftMergeSorter = new MergeSorter(leftArray);
        MergeSorter rightMergeSorter = new MergeSorter(rightArray);

        List<Integer> leftSortedArray = leftMergeSorter.call();
        List<Integer> rightSortedArray = rightMergeSorter.call();

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