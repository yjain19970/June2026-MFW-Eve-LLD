package org.yourcompany.scaler.mfweveningjune26.InventoryManagementSystem;

import java.util.HashMap;
import java.util.Map;

import org.yourcompany.scaler.mfweveningjune26.javaadvconcepts.exceptions.DuplicateIdException;
import org.yourcompany.scaler.mfweveningjune26.javaadvconcepts.exceptions.InvalidQuantityException;

public class Inventory<T extends Item> {
    private Map<String, T> items; 

    public Inventory(){
        items = new HashMap<>();
    }
    
    


    public void addItem(T item) throws InvalidQuantityException, DuplicateIdException{
        System.out.println(items);
        if(item.getQuantity() <0){
            throw new InvalidQuantityException("Quantity cannot be zero.");
        }
        if(items.containsKey(item.getId())){
           throw new DuplicateIdException("Item with this Id already exist!");
        }


        items.put(item.getId(), item);
    }

    public void removeItem(String id){
        // whether the id that you need to remove -- exists or not!
        items.remove(id);
    }

    public T getItem(String id){
        return items.get(id);
    }
}