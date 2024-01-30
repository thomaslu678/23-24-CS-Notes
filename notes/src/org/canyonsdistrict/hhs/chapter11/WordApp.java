package org.canyonsdistrict.hhs.chapter11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class WordApp {

    public static void main(String[] args) throws FileNotFoundException {

        var inputFile = new File("files/words.txt");

        var in = new Scanner(inputFile);
        while (in.hasNext()) {
            var word = in.next();
            System.out.println("'" + word + "'");

        }

        in.close();

    }

}
