package com.durga.day10_Constructor;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class Course {
    // default Constructor
    Course(){
        System.out.println("www.p4n.in");
    }
    Course(String web){
        System.out.println("this is website : "+web);
    }
    public static void main(String[] args) {
        // Create a object
        Course course = new Course();
        Course course1 = new Course("www.codeswithpankaj.com");

    }
}
