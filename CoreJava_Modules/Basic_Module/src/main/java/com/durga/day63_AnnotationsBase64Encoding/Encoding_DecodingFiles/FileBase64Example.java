package com.durga.day63_AnnotationsBase64Encoding.Encoding_DecodingFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

/**
 * @author Durganaresh - 10/24/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class FileBase64Example {
    public static void main(String[] args) {

        try {

            // Read file and encode it to Base64

            byte[] fileContent = Files.readAllBytes(Paths.get("p4n.txt"));

            String encodedString = Base64.getEncoder().encodeToString(fileContent);

            System.out.println("Encoded File String: " + encodedString);

            // Decode Base64 string back to file

            byte[] decodedBytes = Base64.getDecoder().decode(encodedString);

            Files.write(Paths.get("decoded_p4n.txt"), decodedBytes);

            System.out.println("File successfully decoded!");

        } catch (IOException e) {

            e.printStackTrace();

        }

    }
}
