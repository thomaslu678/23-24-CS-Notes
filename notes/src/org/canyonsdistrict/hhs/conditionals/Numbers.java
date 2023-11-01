package org.canyonsdistrict.hhs.conditionals;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a single number: ");
        var value = in.nextInt();

        switch(value){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            default:
        }

    }

}
