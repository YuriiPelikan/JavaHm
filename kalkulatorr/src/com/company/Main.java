package com.company;
import java.lang.Math;

public class Main {

    public static double sig1 = 161, sig2 = 84.39, Rp = 545.7;

    private static double Sum(double a, double b, double N) {
        double S=0,  k=a;
        a=0;
        double h = (b - a) / (N - 1);
        for (int i = 1; i <= N; i++) {
            S = S + h * (f(k, Rp, sig1, sig2) + h) / 2;
            k = k + h;
        }
        return S;
    }

    public static double f(double a, double b, double s1, double s2) {
        if (a <= b) {
            return Math.exp(-((a - b) * (a - b)) / (2 * (s1 * s1)));
        } else {
            return Math.exp(-((a - b) * (a - b)) / (2 * (s2 * s2)));
        }
    }

    public static void main(String[] args) {
        double x, a = 0, b = 150, q = 40e20, C, N = 200, integer;
        integer = (Sum(a, b, N));
        x = sig1;
        while (x <= 1000) {
            C = q * f(x, Rp, sig1, sig2) / integer;
            System.out.println(x + C);
            x = x + 1;
        }
    }
}
