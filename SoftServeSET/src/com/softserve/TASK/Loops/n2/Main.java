package com.softserve.TASK.Loops.n2;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Yuriy", 4, 1500);
        employees[1] = new Employee("Sania", 1, 1000);
        employees[2] = new Employee("Ivan", 1, 2000);
        employees[3] = new Employee("Sergiy", 3, 1200);
        employees[4] = new Employee("Zinaida", 2, 4500);

        Employee employee = new Employee();
        employee.Department(employees);


    }
}
