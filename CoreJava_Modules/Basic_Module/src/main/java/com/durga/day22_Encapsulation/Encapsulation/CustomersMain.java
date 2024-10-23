package com.durga.day22_Encapsulation.Encapsulation;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class CustomersMain {
    public static void main(String[] args) {

        Customers obj = new Customers("esha",22,5.6f);
        System.out.println("Name : "+obj.getName());
        System.out.println("Age : "+obj.getAge());
        System.out.println("Height : "+obj.getHeight());
    }
}
