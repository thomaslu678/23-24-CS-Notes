package org.canyonsdistrict.hhs.chapter11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordApp {

    public static void main(String[] args) throws FileNotFoundException {

        var inputFile = new File("files/words.txt");

        Scanner in;

        try {
            in = new Scanner(inputFile);
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            return;
        }



        while (in.hasNext()) {
            var word = in.next();
            System.out.println("'" + word + "'");

        }

        in.close();

    }

}
