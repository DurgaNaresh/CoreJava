package com.durga.day34_Vector;

import java.util.Vector;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class VectorToStringExample {
    public static void main(String[] args) {
        // Create a Vector of strings
        Vector<String> colors = new Vector<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Convert the Vector to a String
        String colorsString = colors.toString();

        // Print the String representation
        System.out.println("Vector as String: " + colorsString);
    }
}
