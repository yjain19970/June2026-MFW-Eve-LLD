package org.yourcompany.scaler.mfweveningjune26.designpattern.builder;

import java.util.ArrayList;

import org.yourcompany.scaler.mfweveningjune26.designpattern.builder.Student.StudentHelper;

public class Client {
    public static void main(String[] args) {

       try {
        Student student =   Student.getBuilder()
           .setFirstName("Yash")
           .setAddress("Address")
           .setAge(12)
           .setBatchId("B1233")
           .setCity("Bangalore")
           .setPhoneNumbers(new ArrayList<>())
           .setPsp(92.1)
           .setStudentId(123445)
           .setSecondaryEmail("secEmail@gmail.com")
           .setPrimaryEmail("primary@gmail.com")
           .build();
       } catch (Exception e) {
            System.out.println("Exception happened: " + e.getMessage());
       }

       System.out.println("OBJECT CREATION SUCCESSFUL!");
    }

    // Lombok
    // @Builder
}
