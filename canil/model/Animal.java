package model;

import enums.Habitat;

public abstract class Animal {

    private String name;
    private int speed;
    private int age;
    private double weight;
    private Habitat habitat;
    private boolean isWild;

    public Animal(String name, int speed, int age, double weight, Habitat habitat, boolean isWild) {
        this.name = name;
        this.speed = speed;
        this.age = age;
        this.weight = weight;
        this.habitat = habitat;
        this.isWild = isWild;
    }

    // Method to OVERRIDOEN by subclasses
    public void makeSound(){
        System.out.println(name + "makes a generic sound");
    }

    // Method to be OVERRIDOEN by subclasses
    public void sleep(){
        System.out.println(name + is sleeping...);
    }
    
}
