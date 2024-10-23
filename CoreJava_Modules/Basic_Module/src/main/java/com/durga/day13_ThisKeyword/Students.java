package com.durga.day13_ThisKeyword;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class Students {
    String Name;
    void GetInfo(String Name){
        this.Name = Name;
        System.out.println("My Name is : "+Name);
    }

    void GetBooks(String Book){
        System.out.println("The Books Name is : "+Book);
        System.out.println("Student Name : "+Name);
    }

    public static void main(String[] args) {
        Students st = new Students();

        st.GetInfo("Neha");
        st.GetBooks("JAVA SE");
    }
}
