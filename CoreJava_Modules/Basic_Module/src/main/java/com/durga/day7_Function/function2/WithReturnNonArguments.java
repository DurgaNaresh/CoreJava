package com.durga.day7_Function.function2;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class WithReturnNonArguments {
    // With Return Type and Non-Arguments

    static int getage(){
        return 45;
    }
    static String getname(){
        return "Neha";
    }
    static float getheight(){
        return 4.5f;
    }

    public static void main(String[] args) {
        // Calling a method with a return type and no arguments

        String name = getname();
        int age = getage();
        float height = getheight();

        System.out.println("Your Name is : "+name);
        System.out.println("Your age is : "+age);
        System.out.println("Your height is : "+height);
    }
}
