package org.yourcompany.scaler.mfweveningjune26.decoratordp;

public class Client {
    public static void main(String[] args) {
        IceCreamConstituent iceCreamConstituent = 
            new OrangeCone(new ChocoSyrup(new OrangeCone()));

        System.out.println("icecream: " + iceCreamConstituent.getCost());
        System.out.println("icecream: " + iceCreamConstituent.getDescription());

    }
}
