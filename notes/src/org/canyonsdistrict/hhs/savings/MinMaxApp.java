package org.canyonsdistrict.hhs.savings;

import java.util.Scanner;

public class MinMaxApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number or anything else to stop: ");
        int largest;
        if (in.hasNextInt()) {
            largest = in.nextInt();
        }
        else {
            System.out.println("You didn't enter a number." );
            return;
        }

        while (in.hasNextInt()) {
            int value = in.nextInt();
            if (largest < value) {
                largest = value;
            }
        }

        System.out.println("The largest value entered was " + largest);

    }

}
