package com.softserve.HOMEWORK.Inheritance.n2;

public class SalariedEmployee extends Employee {
    private int federalTaxIdmember;
    private int fixedPeyment;

    public SalariedEmployee(String name, int federalTaxIdmember, int fixedPeyment) {
        super(name);
        this.federalTaxIdmember = federalTaxIdmember;
        this.fixedPeyment = fixedPeyment;
    }

    public int getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public void setFederalTaxIdmember(int federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }

    public int getFixedPeyment() {
        return fixedPeyment;
    }

    public void setFixedPeyment(int fixedPeyment) {
        this.fixedPeyment = fixedPeyment;
    }

    public int calculatePay() {
        return fixedPeyment;
    }

    @Override
    public String toString() {
        return "SalariedEmployee" + super.toString() + "[federalTaxIdmember=" + federalTaxIdmember + "]";
    }

}



