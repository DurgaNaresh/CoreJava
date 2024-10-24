package com.durga.day24_MathUtility;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class MathUtility {
    // Static constant (final) field
    public static final double PI = 3.14159265359;

    // Static method to calculate the square of a number
    public static double square(double number) {
        return number * number;
    }

    // Static method to calculate the factorial of a number
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
