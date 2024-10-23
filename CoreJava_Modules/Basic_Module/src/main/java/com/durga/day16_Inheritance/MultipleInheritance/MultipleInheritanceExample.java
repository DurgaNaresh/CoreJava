package com.durga.day16_Inheritance.MultipleInheritance;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class MultipleInheritanceExample {
    public static void main(String[] args) {
        Bird bird = new Bird();

        // Call methods from both interfaces
        bird.swim();
        bird.fly();

        // Call a method specific to the Bird class
        bird.sing();
    }
}

// First interface
interface Swimmer {
    void swim();
}

// Second interface
interface Flyer {
    void fly();
}

// Class implementing both interfaces
class Bird implements Swimmer, Flyer {
    @Override
    public void swim() {
        System.out.println("The bird is swimming.");
    }

    @Override
    public void fly() {
        System.out.println("The bird is flying.");
    }

    void sing() {
        System.out.println("The bird is singing.");
    }
}
