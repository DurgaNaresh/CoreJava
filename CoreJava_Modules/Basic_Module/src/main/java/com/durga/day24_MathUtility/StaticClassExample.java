package com.durga.day24_MathUtility;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class StaticClassExample {
    public static void main(String[] args) {
        double radius = 5.0;
        double area = MathUtility.PI * MathUtility.square(radius);
        System.out.println("Area of a circle with radius " + radius + " is " + area);

        int number = 5;
        int factorial = MathUtility.factorial(number);
        System.out.println("Factorial of " + number + " is " + factorial);
    }
}
