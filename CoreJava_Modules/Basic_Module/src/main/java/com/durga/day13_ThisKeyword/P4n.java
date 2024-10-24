package com.durga.day13_ThisKeyword;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class P4n {
    private int number;

    // Constructor that initializes the number field
    public P4n(int number) {
        this.number = number; // Use 'this' to refer to the instance variable
    }

    // Method to display the number
    public void displayNumber() {
        System.out.println("Number: " + this.number); // 'this' is optional here
    }

    // Another constructor that calls the parameterized constructor
    public P4n() {
        this(42); // Call the parameterized constructor with a default number of 42
    }

    public static void main(String[] args) {
        // Create p4n objects using different constructors
        P4n obj1 = new P4n(20);
        P4n obj2 = new P4n();

        // Display the numbers
        System.out.println("Object 1 Number:");
        obj1.displayNumber();

        System.out.println("\nObject 2 Number:");
        obj2.displayNumber();
    }
}
