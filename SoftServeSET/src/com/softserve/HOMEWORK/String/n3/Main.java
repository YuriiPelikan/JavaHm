package com.softserve.HOMEWORK.String.n3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter US currency");
        String currencyUS = scanner.next();

        Currency.checkUScurrency(currencyUS);
    }
}


