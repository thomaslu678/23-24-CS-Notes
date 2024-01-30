package org.canyonsdistrict.hhs.chapter11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountryApp {

    public static void main(String[] args) throws FileNotFoundException {
        var inputFile = new File("files/countries.txt");
        var in = new Scanner(inputFile);

        while (in.hasNextLine()) {
            var line = in.nextLine();
            System.out.println(line);

            int i = 0;
            while (!Character.isDigit(line.charAt(i))) {
                i++;
            }



            var lineScanner = new Scanner(line);

            String country = lineScanner.next();
            long population = 0;

            while (!lineScanner.hasNextLong()) {
                country = country + " " + lineScanner.next();
            }

            population = lineScanner.nextLong();

            System.out.printf("Country: %s Population %d\n", country, population);

        }

        in.close();

    }

}
