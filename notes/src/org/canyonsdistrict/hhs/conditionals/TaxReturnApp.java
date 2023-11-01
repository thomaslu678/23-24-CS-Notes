package org.canyonsdistrict.hhs.conditionals;

import java.util.Scanner;

public class TaxReturnApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Are you married (Y/N): ");
        var status = scanner.nextLine();
        int maritalStatus = status.equalsIgnoreCase("Y")
                ? TaxReturn.MARRIED
                : TaxReturn.SINGLE;
        System.out.print("Enter your income: ");
        var income = scanner.nextDouble();

        var taxReturn = new TaxReturn(income, maritalStatus);
        System.out.printf("Your tax is %.2f\n", taxReturn.getTax());

    }

}
