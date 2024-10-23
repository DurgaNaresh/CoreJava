package com.durga.day2_Operators;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class LogicalOperators {
    //    - Logical AND (&&): Returns true if both operands are true.
    //    - Logical OR (||): Returns true if either operand is true.
    //    - Logical NOT (!): Reverses the logical state of an operand.

    public static void main(String[] args) {
        // and &&
        // left side | right side = result
        //      T    |     T      =   T
        //      T    |     F      =   F
        //      F    |     T      =   F
        //      F    |     F      =   F
        System.out.println(56 < 90 && 676 <= 78 ); // output F

        // or ||
        // left side | right side = result
        //      T    |     T      =   T
        //      T    |     F      =   T
        //      F    |     T      =   T
        //      F    |     F      =   F
        System.out.println(56 < 90 || 676 <= 78 ); // output T

        // not !
        System.out.println(45 != 78 ); // output F
    }
}
