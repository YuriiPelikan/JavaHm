package com.softserve.HOMEWORK.Inheritance.n2;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[4];

        employees[0] = new SalariedEmployee("Artemiy", 1, 2000);
        employees[1] = new ContractEmployee("Oleksiy", 500, 2, 2);
        employees[2] = new SalariedEmployee("Ivaniy", 1, 1000);
        employees[3] = new ContractEmployee("Kyryliy", 300, 4, 1);

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }

    }
}
