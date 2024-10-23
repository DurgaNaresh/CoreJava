package com.durga.day6_Arrays.OneDimensionalArrays;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class StringArrayExample {
    // Declare and create an array of strings

    public static void main(String[] args) {
        // dataType[] arrayName = new dataType[arrayLength];
        String[] subject = new String[5];

        subject[0] = "java";
        subject[1] = "c++";
        subject[2] = "python";
        subject[3] = "ruby";
        subject[4] = "servlet";

        // print all elements
        for (int i = 0; i < subject.length; i++) {
            System.out.println("Subject - "+(i+1)+" : "+subject[i]);
        }
    }
}
