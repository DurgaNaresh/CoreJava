package com.durga.day6_Arrays.OneDimensionalArrays;

import java.util.Scanner;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class SingleArrayUserInput {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Declare the array based on the user input
        int[] numbers = new int[size];

        // Get values for the array from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Access and print array elements
        System.out.println("Array elements:");
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }

        // Close the Scanner
        scanner.close();
    }
}
