package com.softserve.TASK.Inheritance.n1;

public class Dog implements Animal {
    private String dogName;

    public Dog(String dogName) {
        super();
        this.dogName = dogName;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public void voice() {
        System.out.println(dogName + " voice");
    }

    public void feed() {
        System.out.println(dogName + " feed ");

    }
}

