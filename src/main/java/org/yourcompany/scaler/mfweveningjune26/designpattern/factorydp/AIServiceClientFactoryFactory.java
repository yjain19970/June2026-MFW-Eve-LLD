package org.yourcompany.scaler.mfweveningjune26.designpattern.factorydp;

import org.yourcompany.scaler.mfweveningjune26.designpattern.factorydp.llmmodels.AnthropicClient;

public class AIServiceClientFactoryFactory {

    public static AIServiceClientFactory gClientFactory(String param){
        if(param =="openai"){
            return null;
        }else if(param =="claude"){
            return new AnthropicClient();
        }else if(param ==""){
            return null;
        }
        throw new IllegalStateException();
    }        
}
