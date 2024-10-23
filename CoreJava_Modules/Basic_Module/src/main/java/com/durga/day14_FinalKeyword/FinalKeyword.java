package com.durga.day14_FinalKeyword;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class FinalKeyword {
    // Final variable (constant)
    final double PI = 3.14159;

    // Final method that cannot be overridden
    final void displayPI() {
        System.out.println("The value of PI is: " + PI);
    }

    public static void main(String[] args) {
        FinalKeyword example = new FinalKeyword();

        // Access the final variable and method
        System.out.println("Accessing the final variable PI: " + example.PI);
        example.displayPI();
    }
}
