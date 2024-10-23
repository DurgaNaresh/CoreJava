package com.durga.day9_ClassObjects;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
@Getter
@Setter
public class Person {

    // Instance variables
    private String name;
    private int age;
    private String occupation;

    // Constructor
    public Person(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("Pankaj", 30, "Engineer");

        // Use the getter methods to retrieve the object's properties
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Occupation: " + person.getOccupation());

        // Use the setter methods to modify the object's properties
        person.setName("Jane");
        person.setAge(35);
        person.setOccupation("Doctor");

        // Display the modified properties
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Occupation: " + person.getOccupation());
    }
}
