package org.canyonsdistrict.hhs.chapter11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class PopulationApp {

    public static void main(String[] args) throws FileNotFoundException {

        String inputFileName = "";
        String outputFileName = "";

        if (args.length < 4) {
            printHelpMenu();
            return;
        }

        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-1")) {
                inputFileName = args[i + 1];
                continue;
            }
            if (args[i].equals("-o")) {
                outputFileName = args[i + 1];
                continue;
            }
            if (args[i].equals("-h")) {
                printHelpMenu();
                continue;
            }
        }

        if (inputFileName.isEmpty() || outputFileName.isEmpty()) {
            printHelpMenu();
        }

        var inputFile = new File(inputFileName);
        var in = new Scanner(inputFile);
        var out = new PrintWriter(outputFileName);

        var total = 0L;
        var count = 0;

        while (in.hasNextLine()) {
            var line = in.nextLine();
            var lineScanner = new Scanner(line);
            lineScanner.useDelimiter(",");
            lineScanner.next();

//            while(!lineScanner.hasNextLong()) {
//                lineScanner.next();
//            }
            var value = lineScanner.nextLong();
            total += value;
            count++;
        }

        for (var arg : args) {
            System.out.println(arg);
        }

        var average = 0L;
        if (count > 0) {
            average = total/count;
        }

        out.printf("Average population: %d", average);
        out.close();

    }

    private static void printHelpMenu() {
        System.out.println("""
                Usage: 
                    -1 Input File Name
                    -o Output File Name
                    -h help
                """);
    }

}
