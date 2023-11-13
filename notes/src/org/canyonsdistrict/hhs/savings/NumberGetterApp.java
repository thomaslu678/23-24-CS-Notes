package org.canyonsdistrict.hhs.savings;

import java.util.Scanner;

public class NumberGetterApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int value;
        do {
            System.out.println("Enter a number between 1 and 100");
            value = in.nextInt();
        } while (value <= 0 || value > 100);

        System.out.printf("You entered: %d", value);

    }

}
