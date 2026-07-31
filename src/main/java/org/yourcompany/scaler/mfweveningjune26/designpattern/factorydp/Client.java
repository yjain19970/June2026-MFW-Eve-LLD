package org.yourcompany.scaler.mfweveningjune26.designpattern.factorydp;

public class Client {
    public static void main(String[] args) {
        ChatService chatService = new ChatService();
        String output =  chatService
            .sendMessage("Hello", "gemini");
        System.out.println("Output -> "+ output);
    }
}
