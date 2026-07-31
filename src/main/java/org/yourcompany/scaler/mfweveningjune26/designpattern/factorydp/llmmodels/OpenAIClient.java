package org.yourcompany.scaler.mfweveningjune26.designpattern.factorydp.llmmodels;

import org.yourcompany.scaler.mfweveningjune26.designpattern.factorydp.AIServiceClientFactory;
import org.yourcompany.scaler.mfweveningjune26.designpattern.factorydp.features.interfaces.ChatClient;
import org.yourcompany.scaler.mfweveningjune26.designpattern.factorydp.features.interfaces.ImageClient;
import org.yourcompany.scaler.mfweveningjune26.designpattern.factorydp.features.interfaces.NotificationClient;

public class OpenAIClient implements AIServiceClientFactory {

    @Override
    public ChatClient createChatClient() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createChatClient'");
    }

    @Override
    public NotificationClient createNotificationClient() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createNotificationClient'");
    }

    @Override
    public ImageClient createImageClient() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createImageClient'");
    }
    
}
