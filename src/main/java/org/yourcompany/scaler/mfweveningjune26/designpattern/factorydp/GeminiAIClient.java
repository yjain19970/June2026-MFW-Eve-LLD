package org.yourcompany.scaler.mfweveningjune26.designpattern.factorydp;

public class GeminiAIClient implements AIServiceClient {

    @Override
    public String complete(String prompt) {
        return "Running GeminiClient...";
    }
    
}
