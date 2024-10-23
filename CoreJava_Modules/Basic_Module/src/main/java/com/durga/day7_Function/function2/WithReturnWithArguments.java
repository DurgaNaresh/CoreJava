package com.durga.day7_Function.function2;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class WithReturnWithArguments {
    // With Return Type and With Arguments

    static double tax(long price, double gst){

        long GstAmount = (long) (price*gst)/100;
        long Final_Price = price+GstAmount;

        return Final_Price;

    }

    public static void main(String[] args) {
        // Calling a method with a return type and with arguments

        long mrp = (long) tax(12000, 18.5);

        long final_mrp = mrp-10;

        System.out.println("Your Final Price : "+final_mrp);
    }
}
