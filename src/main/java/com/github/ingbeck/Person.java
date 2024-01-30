package com.github.ingbeck;

public class Person {
    String firstName;
    String lastName;
    int age;
    String residence;
    String profession;
    String favoriteFood;

    public Person(String firstName, String lastName, int age, String residence, String profession, String favoriteFood){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.residence = residence;
        this.profession = profession;
        this.favoriteFood = favoriteFood;
    }

    public void introduction(){
        System.out.println("Hello!"+
                            "\nMy name is " + this.firstName + " " + this.lastName + " - nice to meet you." +
                            "\nI am " + this.age + " years old, I currently live in " + this.residence + " and I work as a " + this.profession + "." +
                            "\nFor favorite Food I would choose " + this.favoriteFood);
    }
}
