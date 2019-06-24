package com.softserve.TASK.Inheritance.n1;

public class Main {

    public static void main(String[] args) {

        Animal[] an = { new Cat("Zoya"), new Dog("Larysa"), new Dog("Barsik"), new Cat("Oleksandr") };
        for (int i = 0; i < an.length; i++) {

            an[i].voice();
            an[i].feed();

        }
    }
}
