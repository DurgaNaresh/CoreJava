package com.durga.day63_AnnotationsBase64Encoding.Base64Encoding_Decoding;

import java.util.Base64;

/**
 * @author Durganaresh - 10/24/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class Base64Example {
    public static void main(String[] args) {

        String originalString = "codes with pankaj";

        String encodedString = Base64.getEncoder().encodeToString(originalString.getBytes());

        System.out.println("Original String: " + originalString);

        System.out.println("Encoded String: " + encodedString);

    }

}
