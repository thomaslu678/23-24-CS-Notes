package org.canyonsdistrict.hhs.types;

public class CashRegister {

    private static final double QUARTER_VALUE = 0.25;
    public static final double DIME_VALUE = 0.10;
    public static final double NICKEL_VALUE = 0.05;
    public static final double PENNY_VALUE = .01;

    private double purchaseAmount;
    private double payment;
    private int count;

    public CashRegister() {
        purchaseAmount = 0;
        payment = 0;
        count = 0;
    }

    public void addItem(double amount){
        purchaseAmount += amount;
    }

    public void acceptPayment(int dollars, int quarters, int dimes, int nickels, int pennies){

        payment = dollars + quarters*QUARTER_VALUE + dimes*DIME_VALUE + nickels*NICKEL_VALUE + pennies*PENNY_VALUE;

    }

    public double getChange(){
        double change = payment - purchaseAmount;
        purchaseAmount = 0;
        payment = 0;
        return change;
    }

    public void scan(double price){
        purchaseAmount += price;
        count++; //unary operator
    }

    public double getAverage(){
        return purchaseAmount/count;
    }


}
