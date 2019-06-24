package com.softserve.TASK.Inheritance.n2;

public class Teacher extends Staff {

    public Teacher(String name) {
        super(name);
    }

    @Override
    void print() {
        System.out.println("I am a " + name);

    }

    static String TYPE_PERSON = "Teacher";

    @Override
    void salary() {
        System.out.println("Salary of teacher ");

    }

}
