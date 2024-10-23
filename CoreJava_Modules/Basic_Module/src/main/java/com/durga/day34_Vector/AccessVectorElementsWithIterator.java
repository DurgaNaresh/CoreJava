package com.durga.day34_Vector;

import java.util.Iterator;
import java.util.Vector;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class AccessVectorElementsWithIterator {
    public static void main(String[] args) {
        // Create a Vector of integers
        Vector<Integer> numbers = new Vector<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Obtain an iterator to access Vector elements
        Iterator<Integer> iterator = numbers.iterator();

        // Use the iterator to sequentially access and print elements
        System.out.print("Vector elements: ");
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
