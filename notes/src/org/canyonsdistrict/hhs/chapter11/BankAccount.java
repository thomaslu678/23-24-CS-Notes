package org.canyonsdistrict.hhs.chapter11;

public class BankAccount {

    private double balance;
    private int count;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double balance) {
        this.balance += balance;
    }

    public void withdraw(double balance) {
        if ((this.balance - balance < 0) || (balance < 0)) {
            throw new InsufficientFundsException("Withdrawal exceeds account amount.");
        }
        if (count >= 2) {
            throw new WithdrawLimitExceededException();
        }
        this.balance -= balance;
    }

}
