package org.canyonsdistrict.hhs.io;

import java.util.Scanner;

public class IOTester {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        //extracted(scanner);
        System.out.print("Enter a string: ");
        var value = scanner.nextLine();
        var first = value.substring(0, 1);
        System.out.printf("The first character is \"%s\"", first);
        var last = value.substring(value.length() - 1);
        System.out.printf("The last character is \"%s\"", last);
        var middle = value.substring(1, value.length() - 1);
        System.out.printf("The middle is \"%s\"", middle);


    }

    private static void extracted(Scanner scanner) {
        System.out.print("Enter a whole number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter another whole number: ");
        int number2 = scanner.nextInt();

        System.out.printf("%d + %d = %d", number1, number2, number1+number2);

        /*

        Escape sequences
        \n = newline
        \t = space
        \" = quote
        \\ = \

         */
    }

}
