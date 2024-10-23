package com.durga.day34_Vector;

import java.util.Vector;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class AddElementAtIndexInVector {
    public static void main(String[] args) {
        // Create a Vector of strings
        Vector<String> fruits = new Vector<>();

        // Add elements to the Vector
        fruits.add("Apple");
        fruits.add("Banana");

        // Add an element at a specific position (index 1)
        fruits.add(1, "Cherry");

        // Print the Vector
        System.out.println("Vector: " + fruits);
    }
}
