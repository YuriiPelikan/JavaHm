package com.softserve.HOMEWORK.Loops.n2;

public class Array {
    public int verifyAndCalculate(int numbers[]) {

        int sum = 0;

        int prod = 0;

        boolean isFirst5Positive = true;

        for (int i = 0; i < 5; i++) {
            if (numbers[i] > 0) {

                sum += numbers[i];
            } else {
                isFirst5Positive = false;
                break;
            }

        }

        if (isFirst5Positive = true) {
            System.out.println(sum);
            return sum;
        }

        for (int i = 5; i < 10; i++) {

            prod *= numbers[i];

        }

        System.out.println(prod);
        return prod;
    }
}


