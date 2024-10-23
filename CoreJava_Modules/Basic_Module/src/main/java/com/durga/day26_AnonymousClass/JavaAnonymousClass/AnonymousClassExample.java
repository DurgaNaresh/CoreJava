package com.durga.day26_AnonymousClass.JavaAnonymousClass;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class AnonymousClassExample {
    public static void main(String[] args) {
        // Creating an anonymous class that implements a simple interface
        MyInterface myInterface = new MyInterface() {
            @Override
            public void myMethod() {
                System.out.println("Anonymous class implementing MyInterface.");
            }
        };

        // Calling the method of the anonymous class
        myInterface.myMethod();
    }
}

// A simple interface
interface MyInterface {
    void myMethod();
}
