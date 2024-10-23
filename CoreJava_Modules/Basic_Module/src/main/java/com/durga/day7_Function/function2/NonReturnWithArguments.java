package com.durga.day7_Function.function2;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class NonReturnWithArguments {
    // Non-Return Type and With Arguments

    static void getinfo(String name, int age ,float height){

        System.out.println("Your Name is : "+name);
        System.out.println("Your age is : "+age);
        System.out.println("Your height is : "+height);

    }

    public static void main(String[] args) {
        // Calling a method with no return type and with arguments

        getinfo("Neha", 21, 4.9f);
        getinfo("Tejal", 18, 4.7f);
        getinfo("Piyush", 20, 5.7f);
    }
}
