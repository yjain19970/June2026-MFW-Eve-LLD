package org.yourcompany.scaler.mfweveningjune26.oops.abstraction.interfaces;

public class InterfaceClient {
    public static void main(String[] args) {
        PaymentProvider payment = new RazorpayClient();
        payment.pay(10);

        PaymentProvider payment2 = new PaytmClient();
        payment2.pay(21);
        
        
    }
}
