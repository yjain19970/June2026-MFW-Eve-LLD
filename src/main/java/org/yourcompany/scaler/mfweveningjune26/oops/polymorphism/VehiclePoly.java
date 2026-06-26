package org.yourcompany.scaler.mfweveningjune26.oops.polymorphism;

public class VehiclePoly {
    String licensePlate;
    String vehicleId;
    String wheelerType;
    String color;
    int capacity;


    public double calculateFare(int km){
        return km*0.0;
    }


    public String getLicensePlate() {
        return licensePlate;
    }


    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }


    public String getVehicleId() {
        return vehicleId;
    }


    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }


    public String getWheelerType() {
        return wheelerType;
    }


    public void setWheelerType(String wheelerType) {
        this.wheelerType = wheelerType;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public int getCapacity() {
        return capacity;
    }


    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    
}
