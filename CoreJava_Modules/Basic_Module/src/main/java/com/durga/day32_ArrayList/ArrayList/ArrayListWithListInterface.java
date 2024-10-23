package com.durga.day32_ArrayList.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class ArrayListWithListInterface {
    public static void main(String[] args) {
        // Create an ArrayList using the List interface
        List<String> fruitsList = new ArrayList<>();

        // Add elements to the ArrayList
        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Cherry");

        // Print the elements of the ArrayList
        for (String fruit : fruitsList) {
            System.out.println(fruit);
        }
    }
}
