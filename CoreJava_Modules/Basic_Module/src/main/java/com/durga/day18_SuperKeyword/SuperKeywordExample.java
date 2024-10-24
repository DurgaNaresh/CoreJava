package com.durga.day18_SuperKeyword;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class SuperKeywordExample {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", "Golden Retriever");

        myDog.displayInfo(); // Calls 'eat' using 'super' and displays information
        myDog.bark(); // Calls 'bark' method of the Dog class
    }
}

class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, String breed) {
        super(name); // Calling the constructor of the superclass 'Animal'
        this.breed = breed;
    }

    void bark() {
        System.out.println(name + " is barking.");
    }

    void displayInfo() {
        super.eat(); // Calling the 'eat' method of the superclass
        System.out.println(name + " is a " + breed);
    }
}
