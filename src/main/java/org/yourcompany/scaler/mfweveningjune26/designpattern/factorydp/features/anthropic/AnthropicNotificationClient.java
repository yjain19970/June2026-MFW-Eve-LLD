package org.yourcompany.scaler.mfweveningjune26.designpattern.factorydp.features.anthropic;

import org.yourcompany.scaler.mfweveningjune26.designpattern.factorydp.features.interfaces.NotificationClient;

public class AnthropicNotificationClient implements NotificationClient {

    @Override
    public String runNotificationClient() {
        return "AnthropicNotificationClient notifClient";
    }
    
}
