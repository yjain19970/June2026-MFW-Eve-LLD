package org.yourcompany.scaler.mfweveningjune26.javaadvconcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(8, 5, 3, 8, 2, 9, 4, 7, 6, 2, 8);
        List<Integer> output = new ArrayList<>();
        for(Integer n: numbers){
            if(n%2==0){
                output.add(n);
            }
        }
        Collections.sort(output);
        List<Integer> squaIntegers = new ArrayList<>();
        for(int n: output){
            int sq = n*n;
            if(!squaIntegers.contains(sq)){
                squaIntegers.add(sq);
            }
        }

        System.out.println(squaIntegers);


        // Streams. filter- >sort -> sqaure -> distinct -> collect

        // () :input ; 
        Stream<Integer> st = numbers.stream();

        List<Integer> squaredNumbers =  numbers.stream().filter(n -> n%2 == 0).sorted()
        .map(x -> x*x).distinct().collect(Collectors.toList());
        System.out.println("output: " + squaredNumbers);


        String input = "banana";

        // output: ban
        String[] splitChars =  input.split("");
       
        Stream xyz = Arrays.stream(splitChars);
        xyz.distinct() // This will remove the duplicates from the list.
        .collect(Collectors.toList());

        Map<String, Integer> items = new HashMap<>();
        items.put("Apple", 10);
        items.put("Banana", 25);
        items.put("Cherry", 8);
        items.put("Date", 40);

        items.entrySet().stream().filter(entry -> entry.getValue() > 15)
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));


        /**
         * 
         * find me any number greater than 100
         */

        Optional<Integer> n1 =  numbers.stream().filter(n -> {
            System.out.println("checking: "+ n);
            return n%2 ==0;
        })
        .sorted()
        .filter(n -> n%2 > 3)
        .findAny();
        
        System.out.println("N1: "+ n1);

        /**
         * 
         * filter
         * map
         * findAny
         * collect
         * sort
         * distinct
         * 
         */
        





    }
}
