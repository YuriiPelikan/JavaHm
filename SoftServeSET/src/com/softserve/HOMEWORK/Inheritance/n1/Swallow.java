package com.softserve.HOMEWORK.Inheritance.n1;

public class Swallow extends FlyingBird {

    public Swallow(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Swallow" + super.toString();
    }

}

