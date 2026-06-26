package org.yourcompany.scaler.mfweveningjune26.oops.polymorphism;

import java.util.Date;

public class BikePoly extends  VehiclePoly {
    String bikeType;

  
    @Override
    public double calculateFare(int km){
        System.out.println("bike fare......");
        // Method Overriding
        return km*2.0;
    }


    public void bookRike(String source, String destination){
        System.out.println("Booking a ride method-1");
    }

    public void bookRike(String source, String destination, Date schedule){
        System.out.println("Booking a ride method-2");
    }    

    // Special method only present in bike.
    public boolean  isBikeAScooty(){
        return true;
    }


    public String getBikeType() {
        return bikeType;
    }


    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }    

    
}
