package org.canyonsdistrict.hhs.types;

public class CashRegisterApplication {

    public static void main(String[] args) {

        CashRegister register = new CashRegister();
        register.addItem(1.20);
        register.addItem(4.43);
        register.addItem(0.75);

        register.acceptPayment(8, 5, 30, 4, 50);
        System.out.printf("Change you get: ", register.giveChange());

    }

}
