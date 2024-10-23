package com.durga.day34_Vector;

import java.util.Vector;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class VectorAllinOne {
    public static void main(String[] args) {
        // Create a Vector of strings

        Vector<String> data = new Vector<>();

        // Add elements to the Vector
        data.add("JAVA");
        data.add("C++");
        data.add("Python");
        data.add("Ruby");
        data.add("Go");

        // Print the Vector
        System.out.println("Data : "+data);

        // Add all elements of vector2 to vector1

        Vector<String> data1 = new Vector<>();
        data1.add("Core JAVA");
        data1.add("Advance JAVA");

        data.addAll(data1);

        System.out.println("New Vector : "+data);

        // Access elements in the Vector by index

        // System.out.println("Access data item : "+data.get(2));

        // Change an element in the Vector

        data.set(3, "Swift");
        System.out.println("Update Vector Data : "+data);

        // Print the size of the Vector
        System.out.println("Size of Vector Data : "+data.size());

        // print using loop

        for (String item : data) {
            System.out.println("Data = : "+item);
        }
    }
}
