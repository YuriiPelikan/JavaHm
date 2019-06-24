package com.softserve.HOMEWORK.Introduction.n2;
import java.io.*;
public class Main {

        public static void main (String[]args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("What is your name?");
            String name = br.readLine();
            System.out.println("Where are you live " + name);
            String address = br.readLine();
            System.out.println("Your name is " + name);
            System.out.println("Your address " + address);
        }

    }
