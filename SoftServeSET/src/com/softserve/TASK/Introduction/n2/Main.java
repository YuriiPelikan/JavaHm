package com.softserve.TASK.Introduction.n2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("How are you?");
        String st = br.readLine();

        System.out.println("You are " + st);
    }
}
