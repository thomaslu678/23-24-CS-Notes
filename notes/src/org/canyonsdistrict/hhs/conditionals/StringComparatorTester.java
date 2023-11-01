package org.canyonsdistrict.hhs.conditionals;

import java.util.Scanner;

public class StringComparatorTester {

    public static void main(String[] args) {

        System.out.print("Are you happy today? Y/N: ");
        Scanner in = new Scanner(System.in);
        String answer = in.nextLine();
        if (answer.equalsIgnoreCase("Y")){
            System.out.println(":)");
        }
        else{
            System.out.println(":(");
        }

        String fruit1 = "apple";
        String fruit2 = "Apple";

        // Lexicographical sorting
        System.out.println(fruit1.compareTo(fruit2));

        


    }


}
