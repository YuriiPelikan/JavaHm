package com.softserve.TASK.Exceptions.n1;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter a");
        int a = scanner.nextInt();

        System.out.println("Enter b");
        int b = scanner.nextInt();

        try {
            Rectangle.squareRectangle(a, b);
        } catch (SquareException e) {
            System.err.println(e);
            e.printStackTrace();
        }


    }

}

