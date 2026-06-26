package org.yourcompany.scaler.mfweveningjune26.oops.abstraction.interfaces;

public class RazorpayClient implements PaymentProvider, PaymentProvider2 {

    @Override
    public void pay(double amount) {
        System.out.println("Paying to driver.....");
    }
    
}
