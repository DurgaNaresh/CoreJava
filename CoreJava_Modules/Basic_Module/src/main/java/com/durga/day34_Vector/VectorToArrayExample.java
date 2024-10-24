package com.durga.day34_Vector;

import java.util.Vector;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class VectorToArrayExample {
    public static void main(String[] args) {
        // Create a Vector of integers
        Vector<Integer> numbers = new Vector<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Convert the Vector to an array
        Integer[] numbersArray = numbers.toArray(new Integer[numbers.size()]);

        // Print the array
        System.out.print("Array: ");
        for (Integer number : numbersArray) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
