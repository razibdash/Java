
package com.mycompany.animalproject;


public class Animal {
    
    private String name;
    private int age;
    private String gender;
    private double weight;
    private String eyeColour;
    private String sound;

    public Animal(String name, int age, String gender, double weight, String eyeColour,String sound) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.eyeColour = eyeColour;
        this.sound=sound;
    }
    
    public void sleep(){
        System.out.println("The "+name+ " is Sleeping");
    }
   public void eat(){
        System.out.println("The "+name+ " Is Eating");
    }
   public void move(){
        System.out.println("The "+name+" Is Moving");
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getEyeColour() {
        return eyeColour;
    }

    public void setEyeColour(String eyeColour) {
        this.eyeColour = eyeColour;
    }
    
    public void DisplayAllInformation(){
        System.out.println("This Is: "+name);
        System.out.println("Age: "+age+" Years");
        System.out.println("Gender: "+gender);
        System.out.println("Weight: "+weight+" KG");
        System.out.println("EyeColour: "+eyeColour);
        System.out.println("Sound: "+sound);
    }
   
    
    
    
}
