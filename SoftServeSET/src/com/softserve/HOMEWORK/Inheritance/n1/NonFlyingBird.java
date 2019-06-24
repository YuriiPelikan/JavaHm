package com.softserve.HOMEWORK.Inheritance.n1;

public class NonFlyingBird extends Bird {

    public NonFlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("Bird can't fly");

    }

    @Override
    public String toString() {
        return "NonFlyingBird [fly()=" + isFeathers() + "]";
    }

}