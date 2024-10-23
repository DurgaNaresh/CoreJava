package com.durga.day10_Constructor;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class Client {
    //Default constructor
    Client(){
        System.out.println("welcome... p4n.in");
    }
    // Constructor with parameters
    Client(String name){
        System.out.println("welcome - "+name);
    }
    public static void main(String[] args) {
        Client obj1 = new Client();
        Client obj = new Client("www.p4n.in");

    }
}
