package com.softserve.HOMEWORK.String.n2;

public class Main {
    public static void main(String[] args) {
        String word = "I    am      learning     Java   Core";
        String a = word.replaceAll("\\s+", " ");
        System.out.println(a);

    }
}
