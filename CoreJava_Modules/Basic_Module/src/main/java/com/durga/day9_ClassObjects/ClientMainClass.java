package com.durga.day9_ClassObjects;

import java.util.Scanner;
import com.durga.day9_ClassObjects.Client;
/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class ClientMainClass {
    public static void main(String[] args) {
        // create an object
        Scanner sc = new Scanner(System.in);
        // ClassName ObjectName = new ClassName();
        Client cl = new Client();
        System.out.println("Enter Client Name : ");
        String name = sc.next();
        System.out.println("Enter Client Mobile number : ");
        long mobile = sc.nextLong();

        cl.name = name;
        cl.mobile = mobile;
        cl.info();

//        cl.name = "Toy";
//        cl.mobile = 7897541230l;
//        cl.info();
    }
}
