package org.canyonsdistrict.hhs.chapter11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

public class NumberApp {

    public static void main(String[] args) {

        var console = new Scanner(System.in);
        System.out.print("Input filename: ");
        var inputFileName = console.nextLine();
        System.out.print("Output filename: ");
        var outputFileName = console.nextLine();

        var inputFile = new File(inputFileName);

        try (var fileScanner = new Scanner(inputFile);) {

            var out = new PrintWriter(outputFileName);

            double total = 0;
            while (fileScanner.hasNextDouble()) {
                var value = fileScanner.nextDouble();
                total += value;
                out.printf("%10.2f\n", value);
            }

            out.printf("Total: %10.2f", total);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

}
