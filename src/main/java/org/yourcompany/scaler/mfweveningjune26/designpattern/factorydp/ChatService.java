package org.yourcompany.scaler.mfweveningjune26.designpattern.factorydp;

import org.yourcompany.scaler.mfweveningjune26.designpattern.factorydp.llmmodels.AnthropicClient;

public class ChatService {

    public String sendMessage(String prompt, String param){
        AIServiceClient client =  getAIServiceClientFactory(param);
        System.out.println("Client is: " + client.getClass().getCanonicalName());
        return client.complete(prompt);
    }

    // public AIServiceClientFactory runChat(String param){
        
    // }


    // factory method.
    private AIServiceClient getAIServiceClientFactory(String param){
        if(param =="openai"){
            return new OpenAIClient();
        }else if(param =="gemini"){
            return new GeminiAIClient();
        }
        throw new IllegalStateException("Param not supported");
    }
}
