package com.durga.day17_MethodOverriding;



/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class MethodOverridingExample {
    public static void main(String[] args) {
        Animal1 animal1 = new Dog();
        Animal1 animal2 = new Cat1();

        animal1.makeSound(); // Calls the makeSound method of Dog
        animal2.makeSound(); // Calls the makeSound method of Cat
    }
}

class Animal1 {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal1 {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat1 extends Animal1 {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}
