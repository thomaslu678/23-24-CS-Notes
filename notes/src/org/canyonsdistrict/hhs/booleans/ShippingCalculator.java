package org.canyonsdistrict.hhs.booleans;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ShippingCalculator {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("What country are you shipping to: ");
        var country = in.nextLine();
        String state = "";

        if (country.equalsIgnoreCase("USA")){
            System.out.println("What state are you shipping to: ");
            state = in.nextLine();
        }

        if(country.equalsIgnoreCase("USA") &&
                !state.equalsIgnoreCase("AK") &&
                !state.equalsIgnoreCase("HI"))
        {
            System.out.println(20);
        }

        if(!country.equalsIgnoreCase("USA") ||
                state.equalsIgnoreCase("AK") ||
                state.equalsIgnoreCase("HI"))
        {
            System.out.println(20);
        }

    }

}
