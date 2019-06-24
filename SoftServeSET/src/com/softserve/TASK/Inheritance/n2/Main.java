package com.softserve.TASK.Inheritance.n2;

public class Main {

    public static void main(String[] args) {
        Person[] pr = { new Teacher("Liudmyla Artamola"), new Student("Ivanenko Artem"),
                new Cleaner("Grishina Kateryna"), new Teacher("Tarik Stetham"), new Student("Ustym Best"),
                new Cleaner("Romanka Tania"), new Teacher("Radik Olia"), new Student("Tambov Ruslan"),
                new Cleaner("Bulldog Yarik") };

        for (int i = 0; i < pr.length; i++) {
            pr[i].print();
            pr[i].salary();
        }

    }

}