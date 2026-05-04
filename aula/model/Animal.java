package model;

import enums.Habitat;

public class Animal {
    private String name;
    private int speed;
    private int age;
    private double weight;
    private Habitat habitat;
    private boolean isWild;

    
    public Animal(String name; int speed, int age, double weight, Habitat habitat, boolean isWild) {
    this.name = name;
    this.speed = speed;
    this.age = age;
    this.weight = weight;
    this.habitat = habitat;
    this.isWild = isWild;
    }


    // Method to be OVERRIDDEN by subclasses
    public void makeSound(){
        System.out.println(name + "makes a generic sound");
    }

    // Method to be a OVERRIDDEN by subclasses
    public void sleep(){
        System.out.println(name + "is sleeping...");
    }

    public void move( int distance ){
        System.out.print(name + "moved" + "meters at" + speed + "km/h");
    }

    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + "years");
        System.out.println("Weight: " + weight + "kg");
        System.out.println("Habitat: " + habitat.getDisplayName());
        System.out.println("Wild: " + (isWild? "Yes" : "No"));
        System.out.println("Speed: " + speed + "Km/h");
    }
    //Getters
    public String getName() {return name;}
    public int getSpeed() {return speed;}
    public int getAge() {return age;}
    public double getWeight() {return weight;}
    public Habitat getHabitat() {return habitat;}
    public boolean isWild() {return isWild;}

    //Setters
    public void setSpeed(int speed) {this.speed = speed;}
    public void setAge (int age) {this.age = age;}
    public void setWeight(double weight) {this.weight = weight;}
}