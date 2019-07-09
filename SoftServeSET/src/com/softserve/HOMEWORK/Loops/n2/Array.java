package com.softserve.HOMEWORK.Loops.n2;

public class Array {

    public int verifyAndCalculate(int numbers[]) {

        int sum1 = 0;
        int sum2 = 0;

        boolean isFirst5Positive = true;
        for (int i = 0; i < 5; i++) {
            if (numbers[i] > 0) {
                sum1 += numbers[i];
            } else {
                isFirst5Positive = false;
                break;
            }
        }

        if (isFirst5Positive) {
            System.out.println(sum1);
            return sum1;
        }

        for (int i = 5; i < 10; i++) {
            sum2 += numbers[i];
        }

        System.out.println(sum2);
        return sum2;
    }
}