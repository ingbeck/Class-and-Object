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
        System.out.println();

        //Bonus
        Person ingo = new Person("Ingo", "Becker", 32, "cologne", "system administrator", "gulasch with spätzle");
        Person robin = new Person("Robin", "Rebel", 30, "hamburg", "senior ux designer", "lasagna");
        ingo.introduction();
        System.out.println();
        robin.introduction();
    }
}