package com.durga.day6_Arrays.ArrayExample;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class StringArray {
    public static void main(String[] args) {
        //Datatype ArrayName[] = new Datatype[size]

        String[] data = new String[4];

        // insert data into array

        data[0] = "java";
        data[1] = "c++";
        data[2] = "c";
        data[3] = "ruby";

        // access  data from array item

        //System.out.println(data[1]);

        // access all data

        for (int i = 0; i < data.length; i++) {

            System.out.println((i+1)+" = "+data[i]);

        }
    }
}
