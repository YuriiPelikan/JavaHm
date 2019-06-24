package com.softserve.HOMEWORK.Inheritance.n1;

public class Penguin extends NonFlyingBird {

    public Penguin(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Penguin" + super.toString();
    }

}
