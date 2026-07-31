package org.yourcompany.scaler.mfweveningjune26.designpattern.factorydp.features.anthropic;

import org.yourcompany.scaler.mfweveningjune26.designpattern.factorydp.features.interfaces.ImageClient;

public class AnthropicImageClient implements ImageClient {

    @Override
    public String runImageClient() {
         return "AnthropicImageClient runImageClient";
    }
    
}
