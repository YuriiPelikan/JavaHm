package com.softserve.HOMEWORK.Exception.n1.n1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter d1");
            double d1 = scanner.nextDouble();
            System.out.println("Enter d2");
            double d2 = scanner.nextDouble();
            System.out.println(Div.div(d1, d2));
        } catch (InputMismatchException a) {
            System.err.println("Not a number");
        } catch (ArithmeticException b) {
            System.err.println(b.getMessage());
        }
    }
}
