package com.durga.day57_IOStreams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Durganaresh - 10/24/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class InputStreamExample {
    public static void main(String[] args) {
        try {
            // Create an InputStream for reading from a file
            InputStream inputStream = new FileInputStream("example.txt");

            // Read and process data from the file
            int data;
            while ((data = inputStream.read()) != -1) {
                // Convert the integer data to a character and print it
                char character = (char) data;
                System.out.print(character);
            }

            // Close the input stream to release resources
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
