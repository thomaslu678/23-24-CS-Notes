package org.canyonsdistrict.hhs.savings;

public class Investment {

    private int years;
    private double balance;
    private double interestRate;

    public Investment(int years, double balance, double interestRate) {
        this.years = years;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void calculateInterest(double target) {
        while (balance < target) {
            calculateInterestForOneYear();
        }
    }

    private void calculateInterestForOneYear() {
        double interest = balance * interestRate;
        balance += interest;
        years++;
    }

    public void calculateInterest(int numberOfYears) {
        // Initialize ; condition ; update
        // for (System.out.println("Initialize"); years < numberOfYears; years++){
        for (int i = years; years < numberOfYears; i++, years++){
            double interest = balance * interestRate;
            balance += interest;
        }
    }

    public int getYears() {
        return years;
    }

    public double getBalance() {
        return balance;
    }
}
