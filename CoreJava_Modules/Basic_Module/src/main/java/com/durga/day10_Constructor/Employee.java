package com.durga.day10_Constructor;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class Employee {
    int number = 100;
    String website;
    Employee(){

        System.out.println("JAVA tutorial....");
        System.out.println("Number 1 "+number);

    }

    Employee(String web){
        website = web;
        System.out.println("website name is : "+web);
    }

    void getnumber() {
        System.out.println("Number 1 "+number);
        System.out.println("website name is : "+website);
    }
}
