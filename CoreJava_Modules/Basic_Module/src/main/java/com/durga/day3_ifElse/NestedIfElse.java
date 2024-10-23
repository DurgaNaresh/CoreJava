package com.durga.day3_ifElse;

import java.util.Scanner;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class NestedIfElse {
    public static void main(String[] args) {

        // create a scanner class object

        Scanner sc = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("\n Enter Number 1 \n");
        num1 = sc.nextInt();
        System.out.println("\n Enter Number 2 \n");
        num2 = sc.nextInt();
        System.out.println("\n Enter Number 3 \n");
        num3 = sc.nextInt();

        if(num1 < num2 && num1 < num3) {

            System.out.println("number 1 is smallest .. " +num1);
        }else {


            if(num2 < num1 && num2 < num3) {

                System.out.println("number 2 is smallest .. " +num2);
            }else {

                System.out.println("number 3 is smallest .. " +num3);

            }

        }

    }
}
