package com.durga.day21_Polymorphism;


/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class PolymorphismExample {
    public static void main(String[] args) {
        Animal2 myAnimal1 = new Dog(); // Polymorphic reference to a Dog object
        Animal2 myAnimal2 = new Cat2(); // Polymorphic reference to a Cat object

        myAnimal1.makeSound(); // Calls the 'makeSound' method of Dog
        myAnimal2.makeSound(); // Calls the 'makeSound' method of Cat
    }
}

class Animal2 {
    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal2 {
    @Override
    void makeSound() {
        System.out.println("Dog barks.");
    }
}

class Cat2 extends Animal2 {
    @Override
    void makeSound() {
        System.out.println("Cat meows.");
    }
}
