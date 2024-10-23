package com.durga.day34_Vector;

import java.util.Vector;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class VectorExample {
    public static void main(String[] args) {
        // Create a Vector of strings
        Vector<String> names = new Vector<>();

        // Add elements to the Vector
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Access elements in the Vector
        String firstPerson = names.get(0);
        System.out.println("First person: " + firstPerson);

        // Iterating over the Vector using a for-each loop
        System.out.print("Names: ");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
    }
}
