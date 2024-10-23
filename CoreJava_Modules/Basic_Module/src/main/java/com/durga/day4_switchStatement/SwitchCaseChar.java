package com.durga.day4_switchStatement;

import java.util.Scanner;

import static java.lang.Character.toLowerCase;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class SwitchCaseChar {
    // Check Whether an Alphabet is Vowel or Consonant(user input)
    public static void main(String[] args) {
        // Scanner class object
        Scanner sc = new Scanner(System.in);
        // user input char
        System.out.println("Enter Alphabet ");
        char Alphabet;
        Alphabet = sc.next().charAt(0);

        Alphabet = toLowerCase(Alphabet);

        switch (Alphabet){

            case 'a' :
                System.out.println("Alphabet is Vowel");
                break;
            case 'e':
                System.out.println("Alphabet is Vowel");
                break;
            case 'i':
                System.out.println("Alphabet is Vowel");
                break;
            case 'o':
                System.out.println("Alphabet is Vowel");
                break;
            case 'u':
                System.out.println("Alphabet is Vowel");
                break;
            default:
                System.out.println("Alphabet is Consonant");
        }

    }
}
