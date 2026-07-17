package org.yourcompany.scaler.mfweveningjune26.javaadvconcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.yourcompany.scaler.mfweveningjune26.InventoryManagementSystem.Book;
import org.yourcompany.scaler.mfweveningjune26.InventoryManagementSystem.Clothing;
import org.yourcompany.scaler.mfweveningjune26.InventoryManagementSystem.Electronics;
import org.yourcompany.scaler.mfweveningjune26.InventoryManagementSystem.Item;

public class StreamExercise {
    public static void main(String[] args) {
        List<Item> itemsList1 = new ArrayList<>();
        itemsList1.add(new Electronics("E1","Laptop", 55000, 5, 24));
        itemsList1.add(new Electronics("E2","Mobile Phone", 22000, 8, 12));
        itemsList1.add(new Electronics("E3","Earphones", 1500, 0, 6));
        itemsList1.add(new Book("B1","Java", 799, 10,"James Gosling"));
        itemsList1.add(new Clothing("C1","T-Shirt", -499, 20,"M"));        
        

        //itemsList1.stream()

        /**
         * 1. Output the List of ids of each Item.
         * 
         * 5-6mins
         * 
         * 
         * a. get the List<String> as output
         * b. print the ids, i don't any List<String> ; just need to print
         */
        List<String> Ids = itemsList1.stream()
            .map(item -> item.getId()).collect(Collectors.toList());
        
        itemsList1.stream()
            .map(item -> item.getId()).forEach(id -> System.out.println(id));

        itemsList1.stream().map(item -> item.getId()).peek(n-> System.out.println(n))
        .forEach(n -> {});


        // List of item names, lowercase
        // Laptop -> output: laptop
        itemsList1.stream().map(item -> item.getName().toLowerCase())
            .forEach(System.out::println);

        itemsList1.stream()
        .forEach(item -> System.out.println(item.getName().toLowerCase()));



        // print the length of names of each item
        System.out.println("LENGTH OF ITEM NAME \n");
        itemsList1.stream()
            .forEach(item -> System.out.println(item.getName().length()));


        itemsList1.stream().map(i -> i.getId());
        // stream().map().terminal()



        System.out.println("FILTERING \n");
        // I want to print item names those are priced above 1000
        itemsList1.stream().filter(item -> item.getPrice() > 1000)
        .map(item -> item.getName())
        .forEach(System.out::println);


          // :: ---> explicitely we have not discussed it.
          // ClassName::methodName =>  (input) -> ClassName.methodName(input)


        // Tell me the count of items which are priced above 1000
        long count = itemsList1.stream().filter(item -> item.getPrice() > 1000).count();


        // AllMatch, anyMatch, findFirst
        // AllMatch -> check whether every single item satisfies the condition or not

        // check and return true if every single item has a price associated.
        boolean allItemsHavePrices =  itemsList1.stream()
            .filter(item -> item !=null )
                .allMatch(item ->item.getPrice() > 0);
        System.out.println("hasPrices: " + allItemsHavePrices);


        Optional<Item> itemOpt =  itemsList1.stream().findAny();



        /**
         * 
         * 
         * 
         * In the itemsList filter items priced above 1000 and in stock, get just their names, 
         * remove duplicates, sort alphabetically, keep only the top 2.
         * 
         * 
         * 
         * 
         * 
         * 
         */





        // Reduce functions in stream
        // calculate the sum of quantity from the items list.

        int total1 = 0;
        for(Item item : itemsList1){
            int qt= item.getQuantity();
            total1 = total1 + qt;
        }
        System.out.println(total1);


        // same thing using a stream -> reduce function.

        int finalV =  itemsList1.stream().map(item -> item.getQuantity())
        .reduce(0, (totalSum, quantity) -> totalSum + quantity );

        // reduce func: terminal operation....

        int finalV2 =  itemsList1.stream()
        .map(item -> item.getQuantity())
        .reduce(0, Integer::sum);



    }
}
