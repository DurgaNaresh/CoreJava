package com.durga.day16_Inheritance.Singleinheritance;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class SingleInheritanceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        // The Dog class inherits the eat() method from its superclass (Animal)
        myDog.eat();

        // It also has its own method bark()
        myDog.bark();
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
