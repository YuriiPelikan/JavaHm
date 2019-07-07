package com.softserve.HOMEWORK.OOP.n1;

class Employee {
    private String name;
    private int rate;
    private int hours;

    static double totalSum = 0;

    public Employee() {
    }

    public Employee(int rate, int hours) {
        this.rate = rate;
        this.hours = hours;
    }

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += (salary() + bonuses());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int salary() {
        return rate * hours;
    }

    public String toString() {
        return "Employee [name=" + name + ", rate=" + rate + ", " + "hours=" + hours + "]" + " Salary = " + salary()
                + " Bonuses = " + bonuses();
    }

    public int bonuses() {
        int bonuses = (int) (salary() * 0.1);
        return bonuses;
    }
}
