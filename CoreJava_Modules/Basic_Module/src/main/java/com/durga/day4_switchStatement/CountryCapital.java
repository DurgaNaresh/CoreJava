package com.durga.day4_switchStatement;

import java.util.Scanner;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class CountryCapital {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Name of a Country : ");
        // convert input to lowercase for case insensitivity
        String country = sc.nextLine().toLowerCase();

        String capital;
        int population;
        String language;

        // switch case with string ( country )

        switch(country){

            case "usa" :
                capital = "Washington DC";
                population = 45567246;
                language = "English";
                break;
            case "china" :
                capital = "Beijing";
                population = 99000;
                language = "Mondarin";
                break;
            case "india" :
                capital = "new Delhi";
                population = 7888888;
                language = "Hindi";
                break;
            case "russia" :
                capital = "Moscow";
                population = 8900000;
                language = "Russian";
                break;
            case "Brazil" :
                capital = "Brasilia";
                population = 89767665;
                language = "Portuguese";
                break;
            default :
                System.out.println("information about this country is not avaiable");
                return;

        }

        System.out.println(" Country "+country.toUpperCase());
        System.out.println("Capital : "+capital);
        System.out.println("Population : "+population);
        System.out.println("Language : "+language);


    }
}
