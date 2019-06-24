package com.softserve.HOMEWORK.Inheritance.n2;


public abstract class Employee implements CalculatePay {
    private int employeeld;
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(int employeeld, String name) {
        this.employeeld = employeeld;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeld() {
        return employeeld;
    }

    public void setEmployeeld(int employeeld) {
        this.employeeld = employeeld;
    }

    public String toString() {
        return "[name=" + name + ",salary =" + calculatePay() + "]";
    }

    protected abstract int calculatePay();


}
