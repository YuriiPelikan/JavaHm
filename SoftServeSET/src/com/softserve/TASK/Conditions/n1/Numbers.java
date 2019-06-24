package com.softserve.TASK.Conditions.n1;

import java.util.Scanner;

public class Numbers {

    /* Enter three numbers. Find out how many of them are odd. */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("введіть перше число: ");
        int first = input.nextInt();
        System.out.print("введіть друге число: ");
        int second = input.nextInt();
        System.out.print("введіть третє число: ");
        int third = input.nextInt();
        int count = 0;
        if (first % 2 != 0) {
            ++count;
        }
        if (second % 2 != 0) {
            ++count;
        }
        if (third % 2 != 0) {
            ++count;

        }
        System.out.println("count = " + count);
    }
}

