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
        int min1 = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                min1 = i;
            }

        }
        System.out.print("Minimum = " + min);
        System.out.print("     ");
        System.out.print(min1 + 1 + " place");
    }
}

