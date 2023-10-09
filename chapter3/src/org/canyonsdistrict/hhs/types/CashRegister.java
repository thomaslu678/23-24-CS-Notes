package org.canyonsdistrict.hhs.types;

public class CashRegister {

    private static final double QUARTER_VALUE = 0.25;
    public static final double DIME_VALUE = 0.10;
    public static final double NICKEL_VALUE = 0.05;
    public static final double PENNY_VALUE = .01;

    private double purchase;
    private double payment;

    public CashRegister() {
        purchase = 0;
        payment = 0;
    }

    public void addItem(double amount){
        purchase += amount;
    }

    public void acceptPayment(int dollars, int quarters, int dimes, int nickels, int pennies){

        payment = dollars + quarters*QUARTER_VALUE + dimes*DIME_VALUE + nickels*NICKEL_VALUE + pennies*PENNY_VALUE;

    }

    public double giveChange(){

        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        return change;

    }


}
