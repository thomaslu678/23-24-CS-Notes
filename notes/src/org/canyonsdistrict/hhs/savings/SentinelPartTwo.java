package org.canyonsdistrict.hhs.savings;

import java.util.Scanner;

public class SentinelPartTwo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word or 'Q' to quit: ");
        while (true) {
            String word = in.nextLine();
            if(word.equals("Q")) {
                break;
            } else if (word.equals("q")) {
                System.out.println("You need to enter a 'Q' to Quit");
            }

            System.out.println("You entered: " + word);

        }

    }

}
