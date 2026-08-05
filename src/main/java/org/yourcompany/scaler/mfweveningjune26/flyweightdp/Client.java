package org.yourcompany.scaler.mfweveningjune26.flyweightdp;

public class Client {
    public static void main(String[] args) {
        
        Bullet bullet1 = new Bullet(BulletTypeFactory.getBulletType("AKM"), 
            null, 
            null, 
            null, 0);
    }
}
