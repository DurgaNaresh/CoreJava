package com.durga.day16_Inheritance.MultiLevel_Inheritance;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class MultiLevelInheritanceExample {
    public static void main(String[] args) {
        GermanShepherd myDog = new GermanShepherd();

        // The GermanShepherd class inherits the eat() and bark() methods
        myDog.eat();
        myDog.bark();

        // It also has its own method guard()
        myDog.guard();
    }
}

// Superclass
class Animal {
    void eat() {
        System.out.println("The animal is eating.");
    }
}

// Subclass inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("The dog is barking.");
    }
}

// Subclass inheriting from Dog
class GermanShepherd extends Dog {
    void guard() {
        System.out.println("The German Shepherd is guarding.");
    }
}
