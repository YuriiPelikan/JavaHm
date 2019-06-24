package com.softserve.HOMEWORK.OOP.n1;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Ustym", 300, 2);
        employee1.salary();
        System.out.println(employee1);

        Employee employee2 = new Employee("Yurii", 1200, 2);
        employee2.salary();
        System.out.println(employee2);

        Employee employee3 = new Employee("Mary", 500, 2);
        employee3.salary();
        System.out.println(employee3);

        System.out.println("Total sum = " + Employee.totalSum);

    }

}