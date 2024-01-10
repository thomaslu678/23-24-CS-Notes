package org.canyonsdistrict.hhs.chapter10;

public class BankAccount implements Measurable {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getMeasure() {
        return balance;
    }

//    public String getMeasureValueType() {
//        return "Measured by my double type";
//    }

}
