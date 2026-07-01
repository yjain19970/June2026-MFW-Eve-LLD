package org.yourcompany.scaler.mfweveningjune26.oops.lms;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    private List<User> registeredUsers = new ArrayList<>();
    private List<Book> bookInventory   = new ArrayList<>();
    
    

    public void registerUser(User user) { registeredUsers.add(user); }

    
    public void addBook(Book book)      { bookInventory.add(book); }

    public boolean lendBook(Member member, Book book) {
        // 1. delegate to book.lend(member)
        // 2. if successful, call member.incrementBorrowCount()
        // 3. return the result
        return true;
    }

    public void returnBook(Member member, Book book) {
        // 1. delegate to book.returnItem(member)
        // 2. call member.decrementBorrowCount()
    }

    public List<Book> searchBooks(String criteria) {
        // loop over bookInventory, match by title or author
        return null;
    }

    public List<Book> searchBooks(String criteria, String type) {
        // loop over bookInventory, match by criteria AND book type
        return null;
    }

    public void displayAllBooks() {
        // call displayBookDetails() on each book
    }

    public void displayRegisteredUsers() {
        // call displayDashboard() on each user
    }




    // GETTER AND SETTERS
    public List<User> getRegisteredUsers() {
        return registeredUsers;
    }
    public void setRegisteredUsers(List<User> registeredUsers) {
        this.registeredUsers = registeredUsers;
    }
    public List<Book> getBookInventory() {
        return bookInventory;
    }
    public void setBookInventory(List<Book> bookInventory) {
        this.bookInventory = bookInventory;
    }
}


/**
 * 
 * 
 * Task 1: Set Up Collections
Objective: Understand and implement collections to manage system-wide data.
Step 1.1: Create a class LibraryManagementSystem with:
A List<Book> named bookInventory to store all books.
A List<User> named registeredUsers to store all registered users.
Step 1.2: Explain the purpose of using collections 
Step 1.3: Add methods:
addBook(Book book) to add a book to bookInventory.
registerUser(User user) to add a user to registeredUsers.
Step 1.4: Test the collections by adding a few books and users, then print their details.

Task 2: Implement Search Functionality
Objective: Demonstrate compile-time polymorphism through method overloading.
Step 2.1: Add a static method searchBooks(String criteria) to search for books by title or author. Use a loop to iterate over bookInventory and add matching books to a result list.
Step 2.2: Overload searchBooks with additional parameters:
searchBooks(String criteria, String type) for searching books of a specific type ("TextBook" or "NovelBook").
Implement this method to filter results based on the type of book.
Java Enums
Step 2.3: Test the overloaded methods with different inputs and ensure they return correct results.

Task 3: Integrate Book and User Management
Objective: Combine book and user features to demonstrate system functionality.
Step 3.1: In the main method:
Create a few instances of TextBook and NovelBook.
Add these books to the library using addBook.

 * 
 * 
 * 
 * 
 * 
 * 
 */