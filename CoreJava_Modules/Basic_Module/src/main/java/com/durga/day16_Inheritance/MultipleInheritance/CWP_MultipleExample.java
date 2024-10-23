package com.durga.day16_Inheritance.MultipleInheritance;

import javax.security.auth.Subject;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class CWP_MultipleExample {
    public static void main(String[] args) {
        books book = new books();
        book.GetBooks();
        book.GetStudentInfo();

        Subject1 subjects = new Subject1();
        subjects.GetSubejct();
        subjects.GetStudentInfo();
    }
}

class student{
    void GetStudentInfo(){
        System.out.println("Student : Mumtaz");
        System.out.println("Student  : Joy");
    }
}
class books extends student{
    void GetBooks(){
        System.out.println("JAVA Development");
        System.out.println("Python development");
    }
}
class Subject1 extends student{
    void GetSubejct(){
        System.out.println("Inheritance....");
        System.out.println("Numpy....");
    }
}

