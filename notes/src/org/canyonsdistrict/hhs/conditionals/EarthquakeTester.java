package org.canyonsdistrict.hhs.conditionals;

import java.util.Scanner;

public class EarthquakeTester {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Richter value: ");
        double value = in.nextDouble();

        if (value >= 8){
            System.out.println("Most structures fall");
        }
        else if (value >= 7){
            System.out.println("Many buildings are destroyed");
        }
        else if (value >= 6) {
            System.out.println("Many buildings are considerably damaged, some collapse");
        }
        else if (value >= 4.5){
            System.out.println("Damage to poorly constructed buildings");
        }
        else {
            System.out.println("No damage");
        }


    }

}
