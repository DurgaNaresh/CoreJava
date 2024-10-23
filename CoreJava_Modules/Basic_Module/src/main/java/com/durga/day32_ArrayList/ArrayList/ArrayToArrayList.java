package com.durga.day32_ArrayList.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class ArrayToArrayList {
    public static void main(String[] args) {
        // Create an array
        String[] fruitsArray = {"Apple", "Banana", "Cherry"};

        // Convert the array to an ArrayList
        List<String> fruitsList = new ArrayList<>(Arrays.asList(fruitsArray));

        // Print the elements of the ArrayList
        for (String fruit : fruitsList) {
            System.out.println(fruit);
        }
    }
}
