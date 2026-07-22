package org.yourcompany.scaler.mfweveningjune26.solid;

public abstract class Bird {
    private String name;
    private int age;
    private String color;
    private String type;   // "pigeon", "sparrow", "eagle" ...  
    
    public void eat(){
        System.out.println("Bird is eating....");
    }
    
   




    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    
}
