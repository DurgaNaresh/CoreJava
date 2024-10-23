package com.durga.day19_AbstractClassMethod;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class AbstractClassExample {
    public static void main(String[] args) {
        ConcreteSubclass obj = new ConcreteSubclass();

        // Call the abstract method and the concrete method
        obj.printInfo();
        obj.displayMessage();
    }
}
abstract class p4n {
    // Abstract method without implementation
    abstract void printInfo();

    // Regular (concrete) method with implementation
    void displayMessage() {
        System.out.println("This is a message from p4n.");
    }
}

class ConcreteSubclass extends p4n {
    // Implementation of the abstract method
    @Override
    void printInfo() {
        System.out.println("This is an implementation of printInfo() in ConcreteSubclass.");
    }
}
