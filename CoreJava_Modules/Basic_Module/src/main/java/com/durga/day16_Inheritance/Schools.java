package com.durga.day16_Inheritance;

import com.durga.day13_ThisKeyword.Students;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class Schools {
    public static void main(String[] args) {
        Students1 students = new Students1();
        students.getNotes();
        students.getTeacherName();
    }
}

interface Teacher{

    public void getTeacherName();

}
class Notes{

    void getNotes(){
        System.out.println("Java Development Course Notes..");
    }

}
class Students1 extends Notes implements Teacher{

    public void getTeacherName(){
        System.out.println("Your Teacher Name Neha");
    }

}
