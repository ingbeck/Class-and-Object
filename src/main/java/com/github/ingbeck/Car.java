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
        if(!isStarted){     //checks, if the car is already running
            speed = 0;
            isStarted = true;
            System.out.println(brand + " " + model + " is started.");
        }else{
            System.out.println(brand + " " + model + " is already running!");
        }

    }

    //method to accelerate a car by given newSpeed
    //speed cannot be greater than speedMax
    public void accelerate(int newSpeed){
        if(isStarted){
            speed += newSpeed;
            if(speed < speedMax){
                System.out.println("Current Speed (" + brand + " " + model + "): " + speed + " km/h");
            }else{
                speed = speedMax;
                System.out.println("Maximum speed reached (" + brand + " " + model + "): " + speed + " km/h");
            }
        }else{
            System.out.println("Please start engine first!");
        }
    }
}
