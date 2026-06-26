package org.yourcompany.scaler.mfweveningjune26.oops.polymorphism;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PolyClient {
    public static void main(String[] args) {
        // Parent p = new Child();
        // IS-A Relationship.
        
        VehiclePoly bike = new BikePoly();
        bike.calculateFare(10); // METHOD OVERRIDING-- RUNTIME

        BikePoly bike2 = new BikePoly();
        bike2.isBikeAScooty();

        // COMPILE TIME POLY.
        bike2.bookRike("S", "D");
        bike2.bookRike("s", "d", new Date());
        






    }

    public List<VehiclePoly> fleetList(){
        List<VehiclePoly> list = new ArrayList<>();

        return list;
    }
}
