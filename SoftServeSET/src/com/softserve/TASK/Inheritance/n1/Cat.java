package com.softserve.TASK.Inheritance.n1;

public class Cat implements Animal {
    private String catName;

    public Cat(String catName) {
        super();
        this.catName = catName;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public void voice() {
        System.out.println(catName + " voice");
    }

    public void feed() {
        System.out.println(catName + " feed ");

    }

}

