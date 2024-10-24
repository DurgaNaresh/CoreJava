package com.durga.day30_ExceptionHandling.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class Example2 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Your Name : ");
            String Name = sc.next();
            System.out.println("Enter Your Age : ");
            int age = sc.nextInt();
            System.out.println("Enter Your Height : ");
            int height = sc.nextInt();

            System.out.println("Your Name : "+Name);
            System.out.println("Your Age : "+age);
            int BMI = age/height;
            System.out.println(" Your BMI = "+BMI);
        }catch(InputMismatchException e){
            System.out.println("Enter Only Number ... ");
        }catch(ArithmeticException e){
            System.out.println("do not enter : ");
        }
    }
}
