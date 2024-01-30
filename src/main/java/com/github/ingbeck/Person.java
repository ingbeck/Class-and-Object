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
                            "\nMy name is " + firstName + " " + lastName + " - nice to meet you." +
                            "\nI am " + age + " years old, I currently live in " + residence + " and I work as a " + rofession + "." +
                            "\nFor favorite Food I would choose " + favoriteFood);
    }
}
