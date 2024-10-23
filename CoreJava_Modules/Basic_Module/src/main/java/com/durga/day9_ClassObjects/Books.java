package com.durga.day9_ClassObjects;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class Books {
    void GetBooksInfo(){
        System.out.println("Codeswithpankaj- java hub");
    }

    void GetBooksPrice(int price){
        System.out.println("Books Price -- "+price);
    }

    public static void main(String[] args) {
        //ClassName ObjectName = new ClassName();
        Books obj = new Books();
        obj.GetBooksInfo();
        obj.GetBooksPrice(1300);
    }
}
