package org.yourcompany.scaler.mfweveningjune26.oops.polymorphism;

public class AutoPoly extends VehiclePoly {
    
    @Override
    public double calculateFare(int km){
        // Method Overriding
        return km*3.0;
    }

}
