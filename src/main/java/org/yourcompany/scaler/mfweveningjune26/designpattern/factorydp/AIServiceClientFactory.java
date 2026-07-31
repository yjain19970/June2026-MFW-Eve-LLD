package org.yourcompany.scaler.mfweveningjune26.designpattern.factorydp;

import org.yourcompany.scaler.mfweveningjune26.designpattern.factorydp.features.interfaces.ChatClient;
import org.yourcompany.scaler.mfweveningjune26.designpattern.factorydp.features.interfaces.ImageClient;
import org.yourcompany.scaler.mfweveningjune26.designpattern.factorydp.features.interfaces.NotificationClient;

public interface AIServiceClientFactory {
    
    ChatClient createChatClient();

    NotificationClient createNotificationClient();
    
    ImageClient createImageClient();
}