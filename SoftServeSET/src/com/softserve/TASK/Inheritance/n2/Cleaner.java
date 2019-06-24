package com.softserve.TASK.Inheritance.n2;

public class Cleaner extends Staff{

    public Cleaner(String name) {
        super(name);
    }
    void print() {
        System.out.println("I am a " + name);
    }

    static String TYPE_PERSON = "Cleaner";
    @Override
    void salary() {
        System.out.println("Salary of cleaner ");


    }
}
