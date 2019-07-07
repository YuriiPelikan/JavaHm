package com.softserve.HOMEWORK.Conditions.n1;

public class Numbers {
    private float n1;
    private float n2;
    private float n3;

    public Numbers() { }

    public Numbers(float n1, float n2, float n3) {

        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }

    public float getN3() {
        return n3;
    }

    public void setN3(float n3) {
        this.n3 = n3;
    }

    @Override
    public String toString() {
        return "Numbers [n1=" + n1 + ", n2=" + n2 + ", n3=" + n3 + "]";
    }

    public void numberInRange(float n) {

        if ((n <= 5.0) && (n >= -5.0)) {
            System.out.println(n + " number in range");
        } else {
            System.out.println(n + " number in over range [-5;5]");
        }
    }

    public void max() {

        float max = 0;
        if ((n1 > n2) && (n1 > n3)) {
            max = n1;
        } else if ((n2 > n3) && (n2 > n1)) {
            max = n2;
        } else {
            max = n3;
        }
        System.out.println("Max number = " + max);
    }

    public void min() {
        float min = 0;
        if ((n1 < n2) && (n1 < n3)) {
            min = n1;
        } else if ((n2 < n1) && (n2 < n3)) {
            min = n2;
        } else {
            min = n3;
        }
        System.out.println("Min number=" + min);
    }

}
