package com.softserve.TASK.Loops.n2;

public class Employee {
    private String name;
    private int department_number;
    private int salary;

    public Employee() {
    }

    public Employee(String name, int department_number, int salary) {
        this.name = name;
        this.department_number = department_number;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartment_number() {
        return department_number;
    }

    public void setDepartment_number(int department_number) {
        this.department_number = department_number;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int Department() {
        return department_number;
    }

    public int getDepartment() {
        return Department();
    }

    public void Department(Employee[] employees) {
        System.out.println("Enter department number ");
        int depNumber = Main.scanner.nextInt();


    }


}
