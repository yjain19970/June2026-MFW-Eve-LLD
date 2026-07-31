package org.yourcompany.scaler.mfweveningjune26.designpattern.factorydp.features.anthropic;

import org.yourcompany.scaler.mfweveningjune26.designpattern.factorydp.features.interfaces.ChatClient;

public class AnthropicChatClient implements ChatClient {

    @Override
    public String runChatClient() {
        return "AnthropicChatClient chatClient";
    }

    
    
}
