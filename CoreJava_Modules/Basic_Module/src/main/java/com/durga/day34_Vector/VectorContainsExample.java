package com.durga.day34_Vector;

import java.util.Vector;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class VectorContainsExample {
    public static void main(String[] args) {
        // Create a Vector of integers
        Vector<Integer> numbers = new Vector<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Check if the Vector contains a specific element
        boolean containsTwenty = numbers.contains(20);

        // Print the result
        System.out.println("Vector contains 20: " + containsTwenty);
    }
}
