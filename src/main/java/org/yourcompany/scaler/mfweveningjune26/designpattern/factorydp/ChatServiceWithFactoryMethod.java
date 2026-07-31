package org.yourcompany.scaler.mfweveningjune26.designpattern.factorydp;

import org.yourcompany.scaler.mfweveningjune26.designpattern.factorydp.llmmodels.AnthropicClient;

public class ChatServiceWithFactoryMethod {

    /**
     * Below is the code for factory method DP.
     */



    // Factory method.
    public String sendMessage(String prompt, String param){
        AIServiceClient client =  getAIServiceClientFactory(param);
        System.out.println("Client is: " + client.getClass().getCanonicalName());
        return client.complete(prompt);
    }

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
