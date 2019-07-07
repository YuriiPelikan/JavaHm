package com.softserve.HOMEWORK.Inheritance.n1;

public class FlyingBird extends Bird {

    public FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("Bird can fly");
    }

    @Override
    public String toString() {
        return "FlyingBird [fly()=" + isFeathers() + "]";
    }

}
