package com.softserve.TASK.Loops.n1;

public class Array {
    public void maxNumber(int arr[]) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("max = " + max);
    }

    public void sum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] % 2 == 0) {
                sum++;
            }
        System.out.println("the sum of positive numbers in the array = " + sum);
    }
    public void sumNeg(int arr[]) {
        int sumNeg = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] % 2 == 1) {
                sumNeg++;
            }
        System.out.println("the amount of negative numbers in the array = " + sumNeg);
    }

    public void Values(int arr[]) {
        int neg = 0;
        int pos=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                neg++;
            }
            if (arr[i] % 2 == 0) {
                pos++;
            }

        }
        if(pos>neg) {
            System.out.println("Positive numbers are more than negative");
        }
        if(pos<neg) {
            System.out.println("Negative numbers are more than positive");
        }


        {
        }
    }
}

