package com.softserve.TASK.Inheritance.n2;

public class Student extends Person {

    public Student(String name) {
        super(name);

    }

    static String TYPE_PERSON = "Student";

    @Override
    void print() {
        System.out.println("I am a " + name);

    }

}
