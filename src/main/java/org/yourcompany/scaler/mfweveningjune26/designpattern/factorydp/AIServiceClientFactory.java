package org.yourcompany.scaler.mfweveningjune26.designpattern.factorydp;

import org.yourcompany.scaler.mfweveningjune26.designpattern.factorydp.features.ChatClient;
import org.yourcompany.scaler.mfweveningjune26.designpattern.factorydp.features.ImageClient;
import org.yourcompany.scaler.mfweveningjune26.designpattern.factorydp.features.NotificationClient;

public interface AIServiceClientFactory {
    
    ChatClient createChatClient();

    NotificationClient createNotificationClient();
    
    ImageClient createImageClient();
}

/**
 * 
 * 
 * 
 * Input: "openAI"
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
