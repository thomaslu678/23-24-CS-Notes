package org.canyonsdistrict.hhs.types;

public class CashRegisterApplication {

    public static void main(String[] args) {

        CashRegister register = new CashRegister();
        register.addItem(1.20);
        register.addItem(4.43);
        register.addItem(0.75);

        register.acceptPayment(8, 5, 30, 4, 50);

        System.out.printf("Average amount: %.2f", register.getAverage());

        System.out.printf("Change you get: %.2f", register.getChange());

    }

}
