package com.softserve.TASK.Inheritance.n2;

public abstract class Staff extends Person {
    public Staff(String name) {
        super(name);
    }

    abstract void salary();

    @Override
    void print() {
        System.out.println("I am a " + name);

    }

}
