package com.softserve.TASK.Conditions.n3;

import java.util.Scanner;

public class Country {

    public static void main(String[] args) {
        /*
         * Enter the name of the country. Print the name of the continent. (Declare enum
         * with names of continents)
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the country: ");
        String country = sc.nextLine();
        switch (country) {
            case "Ukraine": {
                System.out.println(Continent.EURASIA);
                break;
            }
            case "USA": {
                System.out.println(Continent.NORTH_AMERICA);
                break;
            }
            case "Senegal": {
                System.out.println(Continent.AFRICA);
                break;
            }
            case "Brasil": {
                System.out.println(Continent.SOUTH_AMERICA);
                break;
            }
        }
    }
}
