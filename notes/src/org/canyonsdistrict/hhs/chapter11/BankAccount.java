package org.canyonsdistrict.hhs.chapter11;

public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double balance) {
        this.balance += balance;
    }

    public void withdraw(double balance) {
//        if(this.balance - balance < 0) ||
        this.balance -= balance;
    }

}
