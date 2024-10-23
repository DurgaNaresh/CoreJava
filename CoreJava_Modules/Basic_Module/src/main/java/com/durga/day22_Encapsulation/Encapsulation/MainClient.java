package com.durga.day22_Encapsulation.Encapsulation;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class MainClient {
    public static void main(String[] args) {
        Clients clients = new Clients("neha",21);
        clients.setName("Rohit");
        String name_m = clients.getName();
        int age_m = clients.getAge();
        System.out.println("My Name is : "+name_m);
        System.out.println("My Age is : "+age_m);
    }
}
