package org.canyonsdistrict.hhs.chapter10.interfaces;

public class BankAccount implements Measurable, Comparable{

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getMeasure() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public int compareTo(Object o) {
        var other = (BankAccount) o;

        if (balance < other.balance) {
            return -1;
        }

    }

//    public String getMeasureValueType() {
//        return "Measured by my double type";
//    }

}
