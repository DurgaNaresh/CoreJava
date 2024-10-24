package com.durga.day6_Arrays.MultidimensionalArrays;

import java.util.Scanner;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class MultidimensionalArraysIntINPUT {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row,col;

        System.out.println("Enter col number : \n");
        col = sc.nextInt();
        System.out.println("Enter row number : \n");
        row = sc.nextInt();

        int[][] data = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                System.out.print("Enter row and col - "+i+j+"\n");
                data[i][j] = sc.nextInt();

            }
            System.out.println();
        }

        System.out.println("-------------------");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                System.out.print(" "+data[i][j]);
            }
            System.out.println();
        }
    }
}
