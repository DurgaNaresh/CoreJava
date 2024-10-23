package com.durga.day5_loops.nestedLoop;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class NestedForLoop {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" X ");
            }
            System.out.println();
        }

    }
}
