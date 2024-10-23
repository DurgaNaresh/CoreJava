package com.durga.day10_Constructor;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class EmployeeMain {

    public static void main(String[] args) {

        Employee em = new Employee();
        em.number = 900;
        Employee em1 = new Employee("codeswithpankaj.com");
        Employee em2 = new Employee();
        em.getnumber();
        em1.getnumber();

    }
}
