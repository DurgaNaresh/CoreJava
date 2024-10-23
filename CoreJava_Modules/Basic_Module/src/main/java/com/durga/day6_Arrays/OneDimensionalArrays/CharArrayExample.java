package com.durga.day6_Arrays.OneDimensionalArrays;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class CharArrayExample {
    public static void main(String[] args) {
        // Declare and create an array of characters
        char[]  letters = new char[5];
        // Initialize array elements
        letters[0] = 'A';
        letters[1] = 'B';
        letters[2] = 'C';
        letters[3] = 'D';
        letters[4] = 'E';

        // Access and print array elements

        for (int i = 0; i < letters.length; i++) {
            System.out.println(i+1+" - "+letters[i]);
        }
    }
}
