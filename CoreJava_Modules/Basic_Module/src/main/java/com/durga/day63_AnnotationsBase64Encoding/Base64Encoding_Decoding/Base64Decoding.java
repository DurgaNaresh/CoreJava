package com.durga.day63_AnnotationsBase64Encoding.Base64Encoding_Decoding;

import java.util.Base64;

/**
 * @author Durganaresh - 10/24/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class Base64Decoding {
    public static void main(String[] args) {

        String encodedString = "Y29kZXMgd2l0aCBwYW5rYWo=";

        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);

        String decodedString = new String(decodedBytes);

        System.out.println("Encoded String: " + encodedString);

        System.out.println("Decoded String: " + decodedString);

    }
}
