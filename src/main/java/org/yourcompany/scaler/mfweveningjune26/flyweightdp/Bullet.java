package org.yourcompany.scaler.mfweveningjune26.flyweightdp;

public class Bullet {
    private BulletType bulletType;

    // Extrinsinc attributes
    private double[] currentCoordinate;
    private double[] targetCoordinate;
    private double[] direction;
    private double speed;

    
    public Bullet(BulletType bulletType, double[] currentCoordinate, double[] targetCoordinate, double[] direction,
            double speed) {
        this.bulletType = bulletType;
        this.currentCoordinate = currentCoordinate;
        this.targetCoordinate = targetCoordinate;
        this.direction = direction;
        this.speed = speed;
    }
    public BulletType getBulletType() {
        return bulletType;
    }
    public double[] getCurrentCoordinate() {
        return currentCoordinate;
    }
    public double[] getTargetCoordinate() {
        return targetCoordinate;
    }
    public double[] getDirection() {
        return direction;
    }
    public double getSpeed() {
        return speed;
    }

    

    
}
