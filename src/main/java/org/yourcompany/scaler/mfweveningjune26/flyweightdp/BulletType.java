package org.yourcompany.scaler.mfweveningjune26.flyweightdp;

// Intrinsic: not going to change.
public class BulletType {
    private final String color;
    private final double radius;
    private final double weight;
    private final int maxDamage;
    private final int maxRange;
    private final byte[] image;

    public BulletType(String color, double radius, double weight, int maxDamage, int maxRange, byte[] image) {
        this.color = color;
        this.radius = radius;
        this.weight = weight;
        this.maxDamage = maxDamage;
        this.maxRange = maxRange;
        this.image = image;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public double getWeight() {
        return weight;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public int getMaxRange() {
        return maxRange;
    }

    public byte[] getImage() {
        return image;
    }

    

    
    
}
