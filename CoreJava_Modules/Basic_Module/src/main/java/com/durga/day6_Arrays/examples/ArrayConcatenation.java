package com.durga.day6_Arrays.examples;

import java.util.Arrays;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class ArrayConcatenation {
    public static void main(String[] args) {
        // Define the arrays
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        // Concatenate the arrays
        int[] concatenatedArray = concatenateArrays(array1, array2);

        // Display the result
        System.out.println("Concatenated Array: " + Arrays.toString(concatenatedArray));
    }

    public static int[] concatenateArrays(int[] array1, int[] array2) {
        int length1 = array1.length;
        int length2 = array2.length;
        int[] result = new int[length1 + length2];

        System.arraycopy(array1, 0, result, 0, length1);
        System.arraycopy(array2, 0, result, length1, length2);

        return result;
    }
}
