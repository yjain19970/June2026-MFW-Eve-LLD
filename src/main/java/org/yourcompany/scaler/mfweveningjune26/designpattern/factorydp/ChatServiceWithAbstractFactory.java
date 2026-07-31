package org.yourcompany.scaler.mfweveningjune26.designpattern.factorydp;

import org.yourcompany.scaler.mfweveningjune26.designpattern.factorydp.llmmodels.AnthropicClient;

public class ChatServiceWithAbstractFactory {
    
    public String generateImage(String prompt, String param){
        AIServiceClientFactory factory = AIServiceClientFactoryFactory.gClientFactory(param); 
        System.out.println("-- generateImage -- \n");

        return factory.createImageClient().runImageClient();
    }  
    
    public String generateNotification(String prompt, String param){
        AIServiceClientFactory factory = AIServiceClientFactoryFactory.gClientFactory(param); 
        System.out.println("-- generateNotification -- \n");
        return factory.createNotificationClient().runNotificationClient();
    }      

    public String generateChat(String prompt, String param){
        AIServiceClientFactory factory = AIServiceClientFactoryFactory.gClientFactory(param); 
        System.out.println("-- generateChat -- \n");
        return factory.createChatClient().runChatClient();
    }  

}
