package org.yourcompany.scaler.mfweveningjune26.oops.lms;

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
    }
}
