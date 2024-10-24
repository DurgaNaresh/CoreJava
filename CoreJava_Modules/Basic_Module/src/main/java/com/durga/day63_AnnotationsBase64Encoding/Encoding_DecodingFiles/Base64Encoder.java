package com.durga.day63_AnnotationsBase64Encoding.Encoding_DecodingFiles;

import java.util.Base64;

/**
 * @author Durganaresh - 10/24/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class Base64Encoder {
    public static void main(String[] args) {
        String originalText = "Annotations help add extra information to your code, " +
                "making it easier to manage and understand. Base64 encoding is a useful " +
                "tool for converting data into a format that can be easily shared or stored.";

        // Convert the string into a byte array
        byte[] bytes = originalText.getBytes();

        // Encode the byte array to a Base64 string
        String encodedText = Base64.getEncoder().encodeToString(bytes);

        // Print the encoded string
        System.out.println("Encoded Text: " + encodedText);
    }
}
