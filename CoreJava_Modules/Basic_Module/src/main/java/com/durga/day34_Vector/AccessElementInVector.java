package com.durga.day34_Vector;

import java.util.Vector;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class AccessElementInVector {
    public static void main(String[] args) {
        // Create a Vector of strings
        Vector<String> colors = new Vector<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Access elements in the Vector by index
        String firstColor = colors.get(0);
        String secondColor = colors.get(1);
        String thirdColor = colors.get(2);

        // Print the accessed elements
        System.out.println("First color: " + firstColor);
        System.out.println("Second color: " + secondColor);
        System.out.println("Third color: " + thirdColor);
    }
}
