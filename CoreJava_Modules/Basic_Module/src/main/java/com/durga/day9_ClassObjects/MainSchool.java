package com.durga.day9_ClassObjects;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class MainSchool {
    public static void main(String[] args) {
        // Create an object
        School sc = new School();
        sc.RollNumber = 1002;
        sc.StudentName = "Mumtaz";

        sc.info();
    }
}

 class School {
    String StudentName;
    int RollNumber;
    void info(){
        System.out.println("Student Name : "+StudentName);
        System.out.println("Student RollNumber : "+RollNumber);
    }
}
