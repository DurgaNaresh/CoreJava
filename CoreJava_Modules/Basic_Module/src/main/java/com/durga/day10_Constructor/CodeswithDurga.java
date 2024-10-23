package com.durga.day10_Constructor;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class CodeswithDurga {
    // Instance variables
    private String courseName;
    private int courseDuration;

    // Constructor with two parameters
    public CodeswithDurga(String name, int duration) {
        courseName = name;
        courseDuration = duration;
    }

    // Method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Duration (in weeks): " + courseDuration);
    }

    public static void main(String[] args) {
        // Create an object using the constructor
        CodeswithDurga course = new CodeswithDurga("Java Programming", 12);

        // Call the displayCourseDetails method to show the course details
        course.displayCourseDetails();
    }
}
