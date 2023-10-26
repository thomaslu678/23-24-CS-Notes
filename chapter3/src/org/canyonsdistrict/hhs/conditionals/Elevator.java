package org.canyonsdistrict.hhs.conditionals;
import java.util.Scanner;

public class Elevator {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.print("What floor would you like to travel to: ");
        int floor = in.nextInt();


        // ternary operator / conditional operator
        int actualFloor
                = floor > 13
                ? floor - 1
                : floor;

        System.out.println(actualFloor);

        /*

        int actualFloor = floor;
        if (floor > 13) {
            actualFloor = floor - 1;
        }
        else{
            actualFloor = floor;
        }

         */

        // DRY: Don't Repeat Yourself


    }

}
