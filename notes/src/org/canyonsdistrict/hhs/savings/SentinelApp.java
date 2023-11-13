package org.canyonsdistrict.hhs.savings;

import java.math.BigDecimal;
import java.util.Scanner;

public class SentinelApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int count = 0;
        BigDecimal sum = BigDecimal.ZERO;
        System.out.print("Please enter the salary for the employee or -1 to quit: ");

        if (!in.hasNextBigDecimal()) {
            System.out.println("Bad value");
            return;
        }

        BigDecimal salary = in.nextBigDecimal();

        while (!salary.equals(BigDecimal.valueOf(-1))) {
            sum = sum.add(salary);
            count += 1;

            System.out.println("Enter the salary for the employee or -1 to quit: ");
            if (in.hasNextBigDecimal()) {
                System.out.println("Bad value");
                return;
            }

            salary = in.nextBigDecimal();

        }

        if (count == 0) {
            System.out.println("No values entered");
        }
        else {
            BigDecimal average = sum.divide(BigDecimal.valueOf(count));
            System.out.printf("The average is $%.2f", average);
        }


    }

}
