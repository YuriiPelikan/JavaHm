package com.softserve.TASK.Inheritance.n2;

public abstract class Person {
    public String name;

    public Person(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void print();

    void salary() {
    }
}
