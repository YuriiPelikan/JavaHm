package com.softserve.HOMEWORK.Introduction.n1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final double Pi = 3.1415926536;
        System.out.print("r = ");
        int r = Integer.parseInt(br.readLine());
        double perimeter = 2 * Pi * r;
        System.out.println("perimeter = " + perimeter);
        double area = Pi * r * r;
        System.out.println("area = " + area);
    }

}


