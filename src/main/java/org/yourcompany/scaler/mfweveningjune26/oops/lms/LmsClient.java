package org.yourcompany.scaler.mfweveningjune26.oops.lms;

import java.util.ArrayList;
import java.util.List;

public class LmsClient {
    public static void main(String[] args) {
        Member asha     = new Member("Asha", "asha@email.com");
        Librarian ravi  = new Librarian("Ravi", "ravi@email.com", "EMP-007");

        asha.displayDashboard();
        ravi.displayDashboard();
        System.out.println();
        
        System.out.println("Member ID:    " + asha.getUserId());
        System.out.println("Librarian ID: " + ravi.getUserId());
        System.out.println("Total users:  " + User.getTotalUsers());


        System.out.println("\n MILESTONE-2: \n");

        Book novel  = new NovelBook("N-1", "Dune", "Frank Herbert", "Sci-Fi");

        novel.displayBookDetails();

        System.out.println("Available? " + novel.isAvailable());    // true
        System.out.println("Lended :      " + novel.lend(asha));       // true
        System.out.println("Available? " + novel.isAvailable());    // false
        System.out.println("Lend again:" + novel.lend(asha));       // false        
    
    
        List<Lendable> allLendableBooks = new ArrayList<>();
        allLendableBooks.add(novel);
        allLendableBooks.add(novel);


        LibraryManagementSystem lbms = new LibraryManagementSystem();
        lbms.addBook(novel);
        lbms.registerUser(asha);
        lbms.lendBook(asha, novel);
        lbms.returnBook(asha, novel);
        

    }
}
