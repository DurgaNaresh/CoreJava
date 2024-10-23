package com.durga.day32_ArrayList.ArrayList;

import java.util.ArrayList;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class ArrayListToArray {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        // Convert ArrayList to an array of the same type
        String[] array = arrayList.toArray(new String[arrayList.size()]);

        // Print the elements of the array
        for (String fruit : array) {
            System.out.println(fruit);
        }
    }
}
