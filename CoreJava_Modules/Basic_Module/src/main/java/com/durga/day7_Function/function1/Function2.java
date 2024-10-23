package com.durga.day7_Function.function1;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class Function2 {
    // Non-Return type and With Arguments

    static void info(String Website){
        // function body
        System.out.println("Your Website Name : "+Website);
    }

    static void intro(String name , int age , float height){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Height : "+height);
    }

    public static void main(String[] agr){
        // call static function
        info("@p4n.in");
        info("@Naresh.com");

        intro("Joy",12,3.4f);
        intro("Toy",22,6.7f);
    }
}
