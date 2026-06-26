package org.yourcompany.scaler.mfweveningjune26.oops.abstraction.interfaces;

public class TripService {
    // paying.
    private PaymentProvider paymentProvider;

    public TripService(PaymentProvider paymentProvider) {
        this.paymentProvider = paymentProvider;
    }






    public void processPayment(double amount){
        paymentProvider.pay(amount);
    }

}
