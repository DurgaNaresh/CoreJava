package com.durga.day6_Arrays.ArrayExample;

import java.util.Scanner;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class UserInputArray {
    public static void main(String[] args) {
        // Create an Object
        Scanner sc = new Scanner(System.in);
        // Size of array
        System.out.println("Enter Array Size ... ");
        int size;
        size = sc.nextInt();

        String[] Course = new String[size];

        for (int i = 0; i < Course.length; i++) {

            System.out.println("Enter Course Name = "+(i+1));
            Course[i] = sc.next();

        }

        System.out.println("------output-------------");
        for (int i = 0; i < Course.length; i++) {
            System.out.println((i+1)+" = "+Course[i]);
        }
    }
}
