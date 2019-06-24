package com.softserve.HOMEWORK.Loops.n3;

public class Array {
    public void secondPositive(int numbers[]) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                sum++;
                if (sum == 2) {
                    System.out.println("Position of second positive number: " + i);
                }
            }
        }
    }

    public void minimum(int numbers[]) {
        int min = numbers[0];
        int imin = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                imin = i;
            }

        }
        System.out.println("Minimum = " + min);
        System.out.println(imin + 1 + " place");
    }
}

