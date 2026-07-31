package org.yourcompany.scaler.mfweveningjune26.designpattern.factorydp.llmmodels;

import org.yourcompany.scaler.mfweveningjune26.designpattern.factorydp.AIServiceClientFactory;
import org.yourcompany.scaler.mfweveningjune26.designpattern.factorydp.features.ChatClient;
import org.yourcompany.scaler.mfweveningjune26.designpattern.factorydp.features.ImageClient;
import org.yourcompany.scaler.mfweveningjune26.designpattern.factorydp.features.NotificationClient;

public class AnthropicClient implements AIServiceClientFactory {

    @Override
    public ChatClient createChatClient() {
        System.out.println("AnthropicClient: ");
       // return 
    }

    @Override
    public NotificationClient createNotificationClient() {
         System.out.println("AnthropicClient: ");
    }

    @Override
    public ImageClient createImageClient() {
         System.out.println("AnthropicClient: ");
    }

    
}
