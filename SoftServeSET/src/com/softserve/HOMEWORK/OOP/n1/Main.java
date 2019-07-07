package com.softserve.HOMEWORK.OOP.n1;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Ustym", 300, 5);
        System.out.println(employee1);

        Employee employee2 = new Employee("Yurii", 1200, 6);
        System.out.println(employee2);

        Employee employee3 = new Employee("Mary", 500, 2);
        System.out.println(employee3);

        System.out.println("Total sum = " + Employee.totalSum);

    }

}