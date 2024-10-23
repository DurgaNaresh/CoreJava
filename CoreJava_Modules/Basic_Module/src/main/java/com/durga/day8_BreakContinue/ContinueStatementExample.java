package com.durga.day8_BreakContinue;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class ContinueStatementExample {
    public static void main(String[] args) {
        // Iterate through numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            // Skip printing even numbers
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
