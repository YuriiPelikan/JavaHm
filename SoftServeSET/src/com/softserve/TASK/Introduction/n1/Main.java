package com.softserve.TASK.Introduction.n1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("a = ");
        int a = Integer.parseInt(br.readLine());
        System.out.print("b = ");
        int b = Integer.parseInt(br.readLine());
        int sum = a + b;
        System.out.println("a + b = " + sum);
        int diff = a - b;
        System.out.println("a - b = " + diff);
        int mul = a * b;
        System.out.println("a * b = " + mul);
        int div = a / b;
        System.out.println("a / b = " + div);
    }
}
