package org.yourcompany.scaler.mfweveningjune26.designpattern.factorydp;

public class Client {
    public static void main(String[] args) {
        ChatServiceWithFactoryMethod chatService = new ChatServiceWithFactoryMethod();
        String output =  chatService
            .sendMessage("Hello", "gemini");
        //System.out.println("Output -> "+ output);


        // Abstract Factory
        ChatServiceWithAbstractFactory cFactory = new ChatServiceWithAbstractFactory();
        String outputAbstractFactory = cFactory.generateImage("Hello", "claude");
        System.out.println("outputAbstractFactory -> "+ outputAbstractFactory);
    }
}
