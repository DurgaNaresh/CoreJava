package com.durga.day7_Function.function1;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class Function4 {
    // - With Return type and With Arguments

    static int tax(int price, int gst){
        gst = (price * gst)/100;
        int final_price = gst+price;
        return final_price;
    }


    public static void main(String[] agr){
        // call static function

        int mrp = tax(1200, 18);
        System.out.println(mrp+20);


    }
}
