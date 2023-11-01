package org.canyonsdistrict.hhs.types;

public class CashRegisterApplication {

    public static void main(String[] args) {

        CashRegister register = new CashRegister();
        register.addItem(1.20);
        register.addItem(4.43);
        register.addItem(0.75);

        register.acceptPayment(8, 5, 30, 4, 50);
        var amountText = "Average amount";
        var changeText = "Change amount";

        System.out.printf("%-20s$%.2f\n", amountText, register.getAverage());

        System.out.printf("%-20s$%.2f", changeText, register.getChange());

        /*

        Formatting for strings

        %s - strings
        %d - whole number
        %f - floating point


         */

    }

}
