package com.softserve.HOMEWORK.Exception.n2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static int readNumber(int start, int end) throws NotInRangeException {
        int result = scanner.nextInt();
        if ((start < result) && (result < end)) {
            return result;
        } else {
            throw new NotInRangeException("the number is out of range");
        }
    }

    public static void main(String[] args) {
        int[] arry = new int[10];
        int start = 1;
        int end = 100;

        for (int i = 0; i < arry.length; i++) {
            try {
                System.out.println("Enter int");
                arry[i] = readNumber(start, end);
                start = arry[i];
            } catch (NotInRangeException e) {
                e.printStackTrace();//допомагає відслідковувати виключення
                //printstack допомагає визначити, який метод викликає помилку
            } catch (InputMismatchException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        for (int i = 0; i < arry.length; i++) {
            System.out.print(arry[i]);
        }
    }
}

