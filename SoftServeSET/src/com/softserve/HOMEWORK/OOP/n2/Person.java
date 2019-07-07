package com.softserve.HOMEWORK.OOP.n2;

import java.util.Scanner;

public class Person {
    private String name;
    private int birthYear;
    static int age;

    public Person() {
    }

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
        age = 2019 - birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int age() {
        age = 2019 - birthYear;
        return age;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        name = sc.next();
        System.out.println("Enter birth");
        birthYear = sc.nextInt();
    }

    public void output() {
        System.out.println("name=" + name + ", birthYear=" + birthYear + ", " + "age=" + age());
    }

    public String changeName(String newName) {
        name = newName;
        return name;
    }

}
