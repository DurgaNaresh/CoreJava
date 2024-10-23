package com.durga.day32_ArrayList.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class InitializeArrayList {
    public static void main(String[] args) {
        // Create and initialize an ArrayList in a single line
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));

        // Print the elements of the ArrayList
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
