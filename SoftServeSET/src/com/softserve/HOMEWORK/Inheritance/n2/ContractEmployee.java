package com.softserve.HOMEWORK.Inheritance.n2;

public class ContractEmployee extends Employee{


    private int rate;
    private int hours;

    private int socialSecurityNumber;

    public ContractEmployee(String name, int rate, int hours, int socialSecurityNumber) {
        super(name);
        this.rate = rate;
        this.hours = hours;
        this.socialSecurityNumber = socialSecurityNumber;
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

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(int socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int calculatePay() {

        int salary = rate * hours;

        return salary;

    }
}
