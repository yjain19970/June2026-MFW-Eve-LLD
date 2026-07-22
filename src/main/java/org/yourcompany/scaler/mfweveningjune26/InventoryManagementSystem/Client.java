package org.yourcompany.scaler.mfweveningjune26.InventoryManagementSystem;

import org.yourcompany.scaler.mfweveningjune26.javaadvconcepts.exceptions.DuplicateIdException;
import org.yourcompany.scaler.mfweveningjune26.javaadvconcepts.exceptions.InvalidQuantityException;

public class Client {
    public static void main(String[] args) {
        Inventory<Item> inventory2 = new Inventory<>();

        Item laptop = new Electronics("E1", "Laptop", 55000, 5, 24);
        Item mobilePhone = new Electronics("E2", "Mobile Phone", 22000, 8, 12);
        Item earphones = new Electronics("E3", "Earphones", 1500, -2, 6);   // invalid quantity, on purpose
        Item javaBook = new Book("B1", "Java", 799, 10, "James Gosling");
        Item tShirt = new Clothing("C1", "T-Shirt", 499, 20, "M");

        try {
                inventory2.addItem(laptop);
                inventory2.addItem(mobilePhone);
                inventory2.addItem(earphones);   // throws InvalidQuantityException
                inventory2.addItem(javaBook); // X
                inventory2.addItem(tShirt); // X
        } 
        catch (InvalidQuantityException e) {
            System.out.println("Exception happened: InvalidQuantityException" );
        } catch(DuplicateIdException e){
            System.out.println("executing this block!!!");
            System.out.println("Exception happened: DuplicateIdException" );
        } 
        catch(Exception e){
            System.out.println("any other exception happened!!!");
        }
        // Parent p = new CHild();
        // Exception e
    }
}
