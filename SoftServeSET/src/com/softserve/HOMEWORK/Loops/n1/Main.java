package com.softserve.HOMEWORK.Loops.n1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] month = {28, 30, 31};
        System.out.println("Enter the number of month: ");
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();

        if (first == 1) {
            System.out.print("January " + month[2]);
        }
        if (first == 2) {
            System.out.print("February " + month[0]);
        }
        if (first == 3) {
            System.out.print("March " + month[2]);
        }
        if (first == 4) {
            System.out.print("April " + month[1]);
        }
        if (first == 5) {
            System.out.print("May " + month[2]);
        }
        if (first == 6) {
            System.out.print("June " + month[1]);
        }
        if (first == 7) {
            System.out.print("July " + month[2]);
        }
        if (first == 8) {
            System.out.print("August " + month[2]);
        }
        if (first == 9) {
            System.out.print("September " + month[1]);
        }
        if (first == 10) {
            System.out.print("October " + month[2]);
        }
        if (first == 11) {
            System.out.print("November " + month[1]);
        }
        if (first == 12) {
            System.out.print("December " + month[2]);
        }
    }
}
