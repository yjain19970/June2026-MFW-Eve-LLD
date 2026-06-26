package org.yourcompany.scaler.mfweveningjune26.oops.abstraction;

public abstract class VehicleAbstraction {
    public abstract double getBaseRate(); // should be abstract; 

    public double calculateFare(int km){
        // getBaseRate() > should return you base rate of each vehicle.
        return km * getBaseRate();
    }
}
