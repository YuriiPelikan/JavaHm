package com.softserve.HOMEWORK.Exception.n1.n1;

public class Div {
    public static double div(double num1, double num2) throws ArithmeticException{
        if (num1 != 0.0) {
            return num1 / num2;
        } else {
            throw new ArithmeticException("Can not div by zero");
        }
    }
}
