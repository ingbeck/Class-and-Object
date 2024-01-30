package com.github.ingbeck;

public class Car {
    //Properties
    String brand;
    String model;
    String color;
    int ps;
    int speedMax;
    int speed;
    boolean isStarted = false;

    //Constructors
    public Car(String brand, String model, String color, int ps, int speedMax){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.ps = ps;
        this.speedMax = speedMax;
    }

    //Methods
    //method to start a car
    public void start(){
        if(!isStarted){     //checks, if the car is already started
            this.speed = 0;
            this.isStarted = true;
            System.out.println(this.brand + " " + this.model + " is started.");
        }else{
            System.out.println(this.brand + " " + this.model + " is already running!");
        }

    }

    //method to accelerate a car by given newSpeed
    //speed cannot be greater than speedMax
    public void accelerate(int newSpeed){
        if(this.isStarted){
            this.speed += newSpeed;
            if(this.speed < speedMax){
                System.out.println("Current Speed (" + this.brand + " " + this.model + "): " + this.speed + " km/h");
            }else{
                this.speed = speedMax;
                System.out.println("Maximum speed reached (" + this.brand + " " + this.model + "): " + this.speed + " km/h");
            }
        }else{
            System.out.println("Please start engine first!");
        }
    }
}
