package org.yourcompany.scaler.mfweveningjune26.flyweightdp;

import java.util.HashMap;
import java.util.Map;

public class BulletTypeFactory {
    private static Map<String, BulletType> registry = new HashMap<>();


    public static BulletType getBulletType(String name){
        return registry.get(name);
    }

    public void setBulletType(String name, BulletType bulletType){
        // Simple Registry DP.
    }
}
