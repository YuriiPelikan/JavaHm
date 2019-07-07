package com.softserve.HOMEWORK.Conditions.n1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        float f1 = scanner.nextFloat();
        System.out.println("Enter second number");
        float f2 = scanner.nextFloat();
        System.out.println("Enter third number");
        float f3 = scanner.nextFloat();

        Numbers numbers1 = new Numbers(f1, f2, f3);

        numbers1.numberInRange(f1);
        numbers1.numberInRange(f2);
        numbers1.numberInRange(f3);

        System.out.println("Enter code of mistake = ");
        HTTPError error = HTTPError.Error400;

        int er = scanner.nextInt();
        switch (er) {
            case 400:
                error = HTTPError.Error400;
                System.out.println("Your code of error 400");
                break;
            case 401:
                error = HTTPError.Error401;
                System.out.println("Your code of error 401");
                break;
            case 402:
                error = HTTPError.Error402;
                System.out.println("Your code of error 402");
                break;
            case 403:
                error = HTTPError.Error403;
                System.out.println("Your code of error 403");
                break;
            default:
                System.out.println("Enter correct error number");
                break;
        }
    }
}


