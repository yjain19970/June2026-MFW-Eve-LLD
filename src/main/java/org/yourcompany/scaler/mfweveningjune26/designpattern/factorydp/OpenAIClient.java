package org.yourcompany.scaler.mfweveningjune26.designpattern.factorydp;

public class OpenAIClient implements AIServiceClient {

    @Override
    public String complete(String prompt) {
        return "Running OpenAI Client";
    }
    
}
