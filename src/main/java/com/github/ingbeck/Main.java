package com.github.ingbeck;

public class Main {
    public static void main(String[] args) {

        Car audi = new Car("Audi", "A8", "black", 280, 310);
        Car bmw = new Car("BMW", "X5", "white", 220, 250);
        audi.start();
        audi.accelerate(150);
        audi.accelerate(80);
        audi.accelerate(120);
        bmw.start();
        bmw.accelerate(100);
        bmw.accelerate(60);
        bmw.accelerate(80);
    }
}