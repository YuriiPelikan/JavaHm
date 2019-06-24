package com.softserve.HOMEWORK.Introduction.n3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("c1 = ");
        int c1 = Integer.parseInt(br.readLine());
        System.out.print("c2 = ");
        int c2 = Integer.parseInt(br.readLine());
        System.out.print("c3 = ");
        int c3 = Integer.parseInt(br.readLine());
        System.out.print("t1 = ");
        int t1 = Integer.parseInt(br.readLine());
        System.out.print("t2 = ");
        int t2 = Integer.parseInt(br.readLine());
        System.out.print("t3 = ");
        int t3 = Integer.parseInt(br.readLine());
        int dialog1 = c1 * t1;
        System.out.println("the first call will cost " + dialog1);
        int dialog2 = c2 * t2;
        System.out.println("the second call will cost " + dialog2);
        int dialog3 = c3 * t3;
        System.out.println("the third call will cost " + dialog3);
        int DialogTogether = dialog1 + dialog2 + dialog3;
        System.out.println("together call will cost " + DialogTogether);
    }

}

