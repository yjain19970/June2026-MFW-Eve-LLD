package org.yourcompany.scaler.mfweveningjune26.oops.polymorphism;

public class BikePoly extends  VehiclePoly {
    String bikeType;

  
    @Override
    public double calculateFare(int km){
        // Method Overriding
        return km*2.0;
    }


    public String getBikeType() {
        return bikeType;
    }


    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }    

    
}
