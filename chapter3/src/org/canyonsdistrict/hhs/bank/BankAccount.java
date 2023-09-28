package org.canyonsdistrict.hhs.bank;

public class BankAccount {

    private double balance;
    private String name;

    public BankAccount() {
    }

    public BankAccount(double balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    public void deposit(double balance){
        this.balance += balance;
    }

    public void withdraw(double amount){
        double feePercent = .01;
        double feeAmount = amount * feePercent;
        this.balance -= amount;
        this.balance -= feeAmount;
    }

    public double getBalance() {
        return balance;
    }

}
